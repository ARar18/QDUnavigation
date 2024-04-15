package org.example.qdunavigation.services.elemSelectService;

import org.example.qdunavigation.mapper.BuildingMapper;
import org.example.qdunavigation.pojo.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingSelectServiceImpl implements BuildingSelectServiceI{
    @Autowired
    BuildingMapper buildingMapper;
    @Override
    public List<Building> findAll() {
        return buildingMapper.findAll();
    }

    @Override
    public Building findByName(String name) {
        return buildingMapper.findByName(name);
    }
}
