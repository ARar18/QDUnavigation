package org.example.qdunavigation.services;

import org.example.qdunavigation.pojo.Node;

import java.util.List;

public interface NodeSelectServicesI {
    public List<Node> findAll();
    public Node findById(int id);
}
