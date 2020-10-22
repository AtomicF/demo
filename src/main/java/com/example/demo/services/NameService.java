package com.example.demo.services;

import com.example.demo.dao.Name;
import com.example.demo.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NameService {
    private final NameRepository nameRepository;

    @Autowired
    public NameService(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public void addName(String name) {
        Name nameDao = new Name();
        nameDao.setName(name);
        nameRepository.save(nameDao);
    }

    public void deleteName(String name) {
        final List<Name> byName = nameRepository.findByName(name);
        for (Name name1 : byName) {
            nameRepository.delete(name1);
        }
    }

    public List<String> getNames() {
        final Iterable<Name> all = nameRepository.findAll();
        List<String> list = new ArrayList<>();
        for (Name name : all) {
            list.add(name.getName());
        }
        return list;
    }
}
