package com.sportyshoes.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.webservice.model.Products;
import com.sportyshoes.webservice.service.ProductsService;

@RestController
public class ShoesSearchController {

	@Autowired
	ProductsService service;
	
	@GetMapping("/Shoe")
	public List<Products>  getAllShoeProducts() {
		return service.getAllProducts();
	}
	
	@GetMapping("/Shoe/ProductType/{ProductType}")
	public List<Products> getAllProductsByProductType(@PathVariable String ProductType) {
		return service.getAllProductsByProductType(ProductType);
	}
	
	@GetMapping("/Shoe/ProductName/{ProductName}")
	public List<Products>getAllProductsByProductName(@PathVariable String ProductName) {
		return service.getAllProductsByProductName(ProductName);
	}
	
}
