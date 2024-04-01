package org.example.qdunavigation.controller;

import org.example.qdunavigation.mapper.NodeMapper;
import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.services.PTPNavigationServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NavigationController {
    @Autowired
    PTPNavigationServicesImpl ptpNavigationServices;
    @Autowired
    NodeMapper nodeMapper;
    @RequestMapping("/PTPNavi")
    public List<Node> PTPNavi(@RequestParam(value = "src") String src, @RequestParam(value = "tar")String tar){
        return ptpNavigationServices.PTPNavi(src, tar);
    }
    //@RequestMapping("/MultistepNavi")
}
