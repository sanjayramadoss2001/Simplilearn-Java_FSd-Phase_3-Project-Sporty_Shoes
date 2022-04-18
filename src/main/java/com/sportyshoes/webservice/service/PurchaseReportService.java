package com.sportyshoes.webservice.service;

import java.util.List;

import com.sportyshoes.webservice.exceptionhandler.BusinessException;
import com.sportyshoes.webservice.model.Products;
import com.sportyshoes.webservice.model.PurchaseReport;
import com.sportyshoes.webservice.model.User;

public interface PurchaseReportService {
	
	public PurchaseReport createPurchaseReport(PurchaseReport purchaseReport);
	public PurchaseReport updatePurchaseReport(PurchaseReport purchaseReport);
	public PurchaseReport getPurchaseReportById(int id) throws BusinessException;
	public void deletePurchaseReportById(int id);
	
	public List<PurchaseReport> getAllPurchaseReports();
	public List<PurchaseReport> getAllPurchaseReportsByPurchaseReportCategory(String PurchaseReportCategory);
	public List<PurchaseReport> getAllPurchaseReportsByPurchaseReportDate(String PurchaseReportDate);
	

	public List<User> findByUserId();
	public List<Products> findByProductId();
}
