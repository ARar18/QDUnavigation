package org.example.qdunavigation.services.elemSelectService;


import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;

import java.util.List;

public interface EdgeSelectServicesI {
    public List<Edge> findAll();
    public Edge findById(String id);
    public List<Edge> findByNode(Node n);

}
