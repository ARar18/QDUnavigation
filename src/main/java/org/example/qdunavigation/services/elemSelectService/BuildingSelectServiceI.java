package org.example.qdunavigation.services.elemSelectService;

import org.example.qdunavigation.pojo.Building;

import java.util.List;

public interface BuildingSelectServiceI {
    public List<Building> findAll();
    public Building findByName(String name);
}
