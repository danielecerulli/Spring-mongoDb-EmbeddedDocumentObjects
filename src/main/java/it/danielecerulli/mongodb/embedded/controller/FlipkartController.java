package it.danielecerulli.mongodb.embedded.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.danielecerulli.mongodb.embedded.model.User;
import it.danielecerulli.mongodb.embedded.repository.FlipkartRepository;

@RestController
@RequestMapping("/order-service")
public class FlipkartController {
	
	@Autowired
	private FlipkartRepository repo;

	@PostMapping("/placeOrderNow")
	public String placeHolder(@RequestBody User user) {
		repo.save(user);
		return "Order placed succesfully...";
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name) {
		return repo.findByName(name);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city) {
		return repo.findByCity(city);
	}
}
