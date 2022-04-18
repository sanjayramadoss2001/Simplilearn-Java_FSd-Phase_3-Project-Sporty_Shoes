package com.sportyshoes.webservice.service;

import java.util.List;

import com.sportyshoes.webservice.exceptionhandler.BusinessException;
import com.sportyshoes.webservice.model.Products;

public interface ProductsService {
	
	public Products createProduct(Products product);
	public Products updateProduct(Products product);
	public Products getProductById(int id) throws BusinessException;
	public void deleteProductById(int id);
	
	public List<Products> getAllProducts();
	public List<Products> getAllProductsByProductType(String ProductType);
	public List<Products> getAllProductsByProductName(String ProductName);
	
}
