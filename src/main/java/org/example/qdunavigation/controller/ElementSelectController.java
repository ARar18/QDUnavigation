package org.example.qdunavigation.controller;

import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.services.EdgeSelectServiceImpl;
import org.example.qdunavigation.services.NodeSelectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ElementSelectController {
    @Autowired
    NodeSelectServiceImpl nodeSelectService;
    @Autowired
    EdgeSelectServiceImpl edgeSelectService;

    @RequestMapping("/node")
    public List<Node> getNode(){
        return nodeSelectService.findAll();
    }
    @RequestMapping("/edge")
    public List<Edge> getEdge(){
        return edgeSelectService.findAll();
    }
}
