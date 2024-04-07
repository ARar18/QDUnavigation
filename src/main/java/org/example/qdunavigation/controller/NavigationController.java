package org.example.qdunavigation.controller;

import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;
import org.example.qdunavigation.services.MultistepNaviServiceImpl;
import org.example.qdunavigation.services.PTPNaviServicesImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NavigationController {
    final
    PTPNaviServicesImpl ptpNavigationServices;
    final
    MultistepNaviServiceImpl multistepNaviService;

    public NavigationController(PTPNaviServicesImpl ptpNavigationServices, MultistepNaviServiceImpl multistepNaviService) {
        this.ptpNavigationServices = ptpNavigationServices;
        this.multistepNaviService = multistepNaviService;
    }

    @RequestMapping("/PTPNavi")
    public Path PTPNavi(@RequestParam(value = "src") String src, @RequestParam(value = "tar")String tar){
        return ptpNavigationServices.PTPNavi(src, tar);
    }
    @RequestMapping("/MultistepNavi")
    public List<Path> MultistepNavi(@RequestBody List<Node> nodes){
        return multistepNaviService.multistepNavi(nodes);
    }
}
