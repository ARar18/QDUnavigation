package org.example.qdunavigation.controller;

import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;
import org.example.qdunavigation.services.naviService.MultistepNaviServiceImpl;
import org.example.qdunavigation.services.naviService.PTPNaviServicesImpl;
import org.example.qdunavigation.services.naviService.SkdNaviServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class NavigationController {
    final
    PTPNaviServicesImpl ptpNavigationServices;
    final
    MultistepNaviServiceImpl multistepNaviService;
    final
    SkdNaviServiceImpl skdNaviService;

    public NavigationController(PTPNaviServicesImpl ptpNavigationServices, MultistepNaviServiceImpl multistepNaviService, SkdNaviServiceImpl skdNaviService) {
        this.ptpNavigationServices = ptpNavigationServices;
        this.multistepNaviService = multistepNaviService;
        this.skdNaviService = skdNaviService;
    }

    @RequestMapping("/PTPNavi")
    public Path PTPNavi(@RequestParam(value = "src") String src, @RequestParam(value = "tar")String tar){
        return ptpNavigationServices.PTPNavi(src, tar);
    }
    @RequestMapping("/MultistepNavi")
    public List<Path> MultistepNavi(@RequestBody List<Node> nodes){
        return multistepNaviService.multistepNavi(nodes);
    }
    @RequestMapping("/SkdNavi")
    public List<Path> SkdNavi(@RequestParam("file") MultipartFile file, @RequestParam("week") int week, @RequestParam("day") int day){
        return skdNaviService.skdNavi(file, week, day, null, null, null, null);
    }
}
