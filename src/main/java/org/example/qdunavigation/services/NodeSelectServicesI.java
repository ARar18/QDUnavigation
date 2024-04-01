package org.example.qdunavigation.services;

import org.example.qdunavigation.pojo.Node;

import java.util.List;

public interface NodeSelectServicesI {
    public List<Node> findAll();
    public Node findById(String id);
    public Node findNearestNode(int x, int y);
    public double getDistance(int x, int y, Node n);
}
