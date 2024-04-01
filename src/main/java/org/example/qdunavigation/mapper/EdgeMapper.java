package org.example.qdunavigation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;

import java.util.List;

@Mapper
public interface EdgeMapper {
    List<Edge> findAll();
    Edge findById(String id);
    List<Edge> findByNode(String nid);
    int count();
}
