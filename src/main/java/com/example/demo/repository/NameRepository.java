package com.example.demo.repository;

import com.example.demo.dao.Name;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameRepository extends CrudRepository<Name, Long> {
    List<Name> findByName(String name);
}

