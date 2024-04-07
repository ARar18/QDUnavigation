package org.example.qdunavigation.services;

import org.example.qdunavigation.mapper.EdgeMapper;
import org.example.qdunavigation.mapper.NodeMapper;
import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PTPNaviServicesImpl implements PTPNaviServicesI {
    @Autowired
    NodeMapper nodeMapper;
    @Autowired
    EdgeMapper edgeMapper;
    public final int M = -1;
    int[][] map;
    int n;       //顶点的个数
    int[] shortest;  //存放从start到其他节点的最短路径
    boolean[] visited; //标记当前该顶点的最短路径是否已经求出，true表示已经求出
    public void initGraph(){
        n = nodeMapper.count();
        map = new int[300][300];
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= n; j ++){
                map[i][j] = M;
            }
        }
        List<Edge> edges = edgeMapper.findAll();
        for(int i = 0; i < edgeMapper.count(); i ++){
            map[Integer.parseInt(edges.get(i).srcNode)][Integer.parseInt(edges.get(i).tarNode)] = edges.get(i).length;
            map[Integer.parseInt(edges.get(i).tarNode)][Integer.parseInt(edges.get(i).srcNode)] = edges.get(i).length;
        }
    }

    @Override
    public Path PTPNavi(String src, String tar) {
        initGraph();
        shortest = new int[n + 1];
        visited = new boolean[n + 1];
        int orig = Integer.parseInt(src);
        shortest[orig] = 0;
        visited[orig] = true;

        //存放从start到其他各节点的最短路径
        List<List<Node>> routes = new ArrayList<>(){};
        routes.add(new ArrayList<>());
        for(int i = 1; i <= n; i ++){
            routes.add(new ArrayList<>());
            routes.get(i).add(nodeMapper.findById(src));
            routes.get(i).add(nodeMapper.findById(String.valueOf(i)));
        }
        for(int count = 0; count < n; count ++)
        {
            //选出一个距离初始顶点最近的为标记顶点
            int k = M;
            int min = M;
            for(int i = 1; i <= n; i++)//遍历每一个顶点
            {
                if(map[orig][i] != M && !visited[i]) //如果该顶点未被遍历过且与orig相连
                {
                    if(min == M || min > map[orig][i]) //找到与orig最近的点
                    {
                        min = map[orig][i];
                        k = i;

                    }
                }
            }
            //正确的图生成的矩阵不可能出现K== M的情况
            if(k != M)
            {
                shortest[k] = min;
                visited[k] = true;
                //以k为中心点，更新oirg到未访问点的距离
                for (int i = 1; i <= n; i++)
                {
                    if (!visited[i] && map[k][i] != M)
                    {
                        int callen = min + map[k][i];
                        if (map[orig][i] == M || map[orig][i] > callen)
                        {
                            map[orig][i] = callen;
                            routes.get(i).clear();
                            routes.get(i).addAll(routes.get(k));
                            routes.get(i).add(nodeMapper.findById(String.valueOf(i)));
                        }
                    }
                }
            }
        }
        if(map[Integer.parseInt(src)][Integer.parseInt(tar)] == M) return null;

        int sum = 0;
        for(int i = 0; i < routes.get(Integer.parseInt(tar)).size() - 1; i ++){
            sum += edgeMapper.findByNodes(routes.get(Integer.parseInt(tar)).get(i).getNode_no(), routes.get(Integer.parseInt(tar)).get(i + 1).getNode_no()).length;
        }
        Path ret = new Path(routes.get(Integer.parseInt(tar)), sum);

        return ret;
    }
}
