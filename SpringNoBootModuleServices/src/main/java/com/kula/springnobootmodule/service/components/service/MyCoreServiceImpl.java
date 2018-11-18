package com.kula.springnobootmodule.service.components.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyCoreServiceImpl implements  MyCoreService{
    @Override
    public List<String> getNames() {
        return List.of("Yunus","Mami");
    }
}
