package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Task;
import com.example.demo.Repository.Repository;
@Service
public class Service1 {
@Autowired
Repository repos;
	public String deletebyid(int id) {
		repos.deleteById(id);
		return "deleted";
	}
	public Optional<Task> get1function(int id) {
		return repos.findById(id);
	}
	

}
