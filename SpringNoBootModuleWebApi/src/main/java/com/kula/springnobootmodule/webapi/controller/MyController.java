package com.kula.springnobootmodule.webapi.controller;

import com.kula.springnobootmodule.service.components.service.MyCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("names")
public class MyController {

    @Autowired
    private MyCoreService myCoreService;

    @GetMapping
    public List<String> getNames(){
        return myCoreService.getNames();

    }
}
