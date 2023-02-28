package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Task;
import com.example.demo.Repository.Repository;
import com.example.demo.Service.Service1;
@RestController
public class TaskController
{
	@Autowired
	Repository repos;
	@Autowired
	Service1 serv;
	@GetMapping("/getall")
	List <Task> getall()
	{
		return repos.findAll();
	}
	@PostMapping("/post")
	public Task create(@RequestBody Task object)
	{
		return repos.save(object);
	}
	@DeleteMapping("/delete")
	public String deletelist(@RequestParam int id)
	{
		return serv.deletebyid(id);
	}
	@GetMapping("/getone/{id}")
	public Optional <Task> getone(@PathVariable int id)
	{
		return serv.get1function(id);
	}
}
