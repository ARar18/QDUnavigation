package org.example.qdunavigation.controller;

import org.example.qdunavigation.pojo.Building;
import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.services.elemSelectService.BuildingSelectServiceImpl;
import org.example.qdunavigation.services.elemSelectService.EdgeSelectServiceImpl;
import org.example.qdunavigation.services.elemSelectService.NodeSelectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ElementSelectController {
    @Autowired
    NodeSelectServiceImpl nodeSelectService;
    @Autowired
    EdgeSelectServiceImpl edgeSelectService;
    @Autowired
    BuildingSelectServiceImpl buildingSelectService;

    @RequestMapping("/node")
    public List<Node> getNode(){
        return nodeSelectService.findAll();
    }
    @RequestMapping("/NodeNo")
    public Node getNodeById(@RequestParam(value = "id")String id){
        return nodeSelectService.findById(id);
    }
    @RequestMapping("/findNode")
    public Node getNearest(@RequestParam(value = "x")Integer x, @RequestParam(value = "y")Integer y){
        return nodeSelectService.findNearestNode(x, y);
    }
    @RequestMapping("/edge")
    public List<Edge> getEdge(){
        return edgeSelectService.findAll();
    }
    @RequestMapping("/findBuilding")
    public Building getBuildingByName(@RequestParam(value = "name")String name){
        return buildingSelectService.findByName(name);
    }
}
