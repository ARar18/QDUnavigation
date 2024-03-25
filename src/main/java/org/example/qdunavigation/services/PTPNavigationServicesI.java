package org.example.qdunavigation.services;

import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;

import java.util.List;

public interface PTPNavigationServicesI {
    List<Edge> navi(Node src, Node tar);
}
