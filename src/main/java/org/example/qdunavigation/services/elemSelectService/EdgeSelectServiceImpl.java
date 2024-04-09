package org.example.qdunavigation.services.elemSelectService;

import org.example.qdunavigation.mapper.EdgeMapper;
import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdgeSelectServiceImpl implements EdgeSelectServicesI{
    @Autowired
    EdgeMapper edgeMapper;

    @Override
    public List<Edge> findAll(){
        return edgeMapper.findAll();
    }
    @Override
    public Edge findById(String id){
        return edgeMapper.findById(id);
    }
    @Override
    public List<Edge> findByNode(Node n){
        return edgeMapper.findByNode(n.getNode_no());
    }
}
