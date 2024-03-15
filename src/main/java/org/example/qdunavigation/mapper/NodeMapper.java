package org.example.qdunavigation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.qdunavigation.pojo.Node;

import java.util.List;

@Mapper
public interface NodeMapper {
    public List<Node> findAll();
}
