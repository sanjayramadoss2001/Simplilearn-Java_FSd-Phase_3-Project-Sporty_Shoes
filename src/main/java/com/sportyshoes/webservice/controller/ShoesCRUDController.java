package com.sportyshoes.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.webservice.exceptionhandler.BusinessException;
import com.sportyshoes.webservice.model.Products;
import com.sportyshoes.webservice.service.ProductsService;

@RestController
public class ShoesCRUDController {
	
	@Autowired
	private ProductsService service;
	
	private MultiValueMap<String, String> errorMap;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index() {
		return "\nOpen - http://localhost:8089/swagger-ui.html to use the functionalities of the webservice";
	}
	
	@PostMapping("/Shoe")
	public Products createShoeProduct(@RequestBody Products product) {
		return service.createProduct(product);
	}

	@PutMapping("/Shoe")
	public Products updateShoeProduct(@RequestBody Products product) {
		return service.updateProduct(product);
	}

	@GetMapping("/Shoe/{id}")
	public ResponseEntity<Products> getProductById(@PathVariable int id) {
		try {
			return new ResponseEntity<>(service.getProductById(id),HttpStatus.OK);
		} catch (BusinessException e) {
			errorMap=new LinkedMultiValueMap<>();
			errorMap.add("errorMessage", e.getMessage());
			return new ResponseEntity<>(null,errorMap,HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/Shoe/{id}")
	public void deleteProductById(@PathVariable int id) {
		service.deleteProductById(id);
	}

}
