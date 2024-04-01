package org.example.qdunavigation.services;

import org.example.qdunavigation.mapper.NodeMapper;
import org.example.qdunavigation.pojo.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeSelectServiceImpl implements NodeSelectServicesI{
    @Autowired
    NodeMapper nodeMapper;

    @Override
    public Node findById(String id) {
        return nodeMapper.findById(id);
    }

    @Override
    public List<Node> findAll() {
        return nodeMapper.findAll();
    }

    @Override
    public Node findNearestNode(int x, int y){
        List<Node> allNodes = findAll();
        double min = 10000;
        int index = 0;
        for(int i = 0; i < allNodes.size(); i ++){
            double dis = Math.sqrt((allNodes.get(i).getPos_x() - x) * (allNodes.get(i).getPos_x() - x) + (allNodes.get(i).getPos_y() - y) * (allNodes.get(i).getPos_y() - y));
            if(dis < min){
                min = dis;
                index = i;
            }
        }
        return allNodes.get(index);
    }

    @Override
    public double getDistance(int x, int y, Node n) {
        return Math.sqrt((n.getPos_x() - x) * (n.getPos_x() - x) + (n.getPos_y() -y) * (n.getPos_y() -y));
    }
}
