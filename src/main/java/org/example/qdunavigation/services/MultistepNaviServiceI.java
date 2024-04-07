package org.example.qdunavigation.services;

import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;

import java.util.List;

public interface MultistepNaviServiceI {
    List<Path> multistepNavi(List<Node> nodes);
}
