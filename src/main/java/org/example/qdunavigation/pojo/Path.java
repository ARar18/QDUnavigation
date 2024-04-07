package org.example.qdunavigation.pojo;

import java.util.List;

public class Path {
    private List<Node> nodes;
    private int dis;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    public Path(List<Node> nodes, int dis) {
        this.nodes = nodes;
        this.dis = dis;
    }
}
