package it.danielecerulli.mongodb.embedded.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	private String name;
	private int quantity;
	private double price;

}
