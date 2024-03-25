package org.example.qdunavigation.controller;

import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.services.NodeSelectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class NodeController {
    @Autowired
    NodeSelectServiceImpl nodeSelectServiceImpl;
    @RequestMapping("/node")
    public List<Node> getNode(){
        return nodeSelectServiceImpl.findAll();
    }
}
