package org.example.qdunavigation.services.naviService;
import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SkdNaviServiceI {
    public List<Path> skdNavi(MultipartFile file, int week, int day, Node placeForNoon, Node startPlace, Node endPlace, Node placeForSpare);
}
