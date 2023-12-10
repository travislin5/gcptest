package com.example.gcptest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gcptest.model.ToDo;
@Repository
public interface ToDoDao extends JpaRepository<ToDo, Long>{

}
