package org.example.qdunavigation.services;

import org.example.qdunavigation.mapper.NodeMapper;
import org.example.qdunavigation.pojo.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeSelectServiceImpl implements NodeSelectServicesI{
    @Autowired
    NodeMapper nodeMapper;

    @Override
    public Node findById(String id) {
        return nodeMapper.findById(id);
    }

    @Override
    public List<Node> findAll() {
        return nodeMapper.findAll();
    }
}
