package com.example.gcptest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gcptest.dao.ToDoDao;
import com.example.gcptest.model.ToDo;

@RestController
@RequestMapping("/todo")
public class ToDoController {

	@Autowired
	ToDoDao toDoDao;
	
	@GetMapping("/test")
	public String testGet() throws Exception {
		return "這是server來的";
	}

	@PostMapping("/create")
	public void createData(@RequestBody ToDo todo) throws Exception {
		toDoDao.save(todo);
	}

	@PostMapping("/readAllData")
	public List<ToDo> readAllData() throws Exception {
		List<ToDo> userList = toDoDao.findAll();

		if (userList.isEmpty()) {
			return null;
		}
		return userList;
	}

	@PostMapping("/delete")
	public void deleteData(@RequestBody ToDo todo) throws Exception {
		Optional<ToDo> e = toDoDao.findById(todo.getId());
		if (e.isPresent()) {
			toDoDao.deleteById(e.get().getId());
		}
	}

}
