package org.example.qdunavigation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.qdunavigation.pojo.Building;

import java.util.List;
@Mapper
public interface BuildingMapper {
    List<Building> findAll();
    Building findByName(String name);
}
