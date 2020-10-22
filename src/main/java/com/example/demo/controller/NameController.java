package com.example.demo.controller;

import com.example.demo.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    @Autowired
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/allnames")
    public List<String> getAllNames() {
        return nameService.getNames();
    }

    @PostMapping("/addname")
    public void addName(@RequestBody String name) {
        nameService.addName(name);
    }

    @PostMapping("/deletename")
    public void deleteName(@RequestBody String name) {
        nameService.deleteName(name);
    }
}