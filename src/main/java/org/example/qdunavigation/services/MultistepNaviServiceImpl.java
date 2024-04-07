package org.example.qdunavigation.services;

import org.example.qdunavigation.pojo.Node;
import org.example.qdunavigation.pojo.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MultistepNaviServiceImpl implements MultistepNaviServiceI{
    @Autowired
    PTPNaviServicesImpl ptpNavigationServices;

    @Override
    public List<Path> multistepNavi(List<Node> nodes) {
        List<Path> ret = new ArrayList<>(){};
        for(int i = 0; i < nodes.size() - 1; i ++){
            ret.add(ptpNavigationServices.PTPNavi(nodes.get(i).getNode_no(), nodes.get(i + 1).getNode_no()));
        }
        return ret;
    }
}
