package org.example.qdunavigation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.qdunavigation.pojo.Edge;
import org.example.qdunavigation.pojo.Node;

import java.util.List;

@Mapper
public interface EdgeMapper {
    List<Edge> findAll();
    Edge findById(int id);
    List<Edge> findByNode(int nid);
}
