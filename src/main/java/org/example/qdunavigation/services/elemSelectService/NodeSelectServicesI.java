package org.example.qdunavigation.services.elemSelectService;

import org.example.qdunavigation.pojo.Node;

import java.util.List;

public interface NodeSelectServicesI {
    public List<Node> findAll();
    public Node findById(String id);
    public Node findNearestNode(double x, double y);
    public double getDistance(int x, int y, Node n);
}
