package com.sportyshoes.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.webservice.model.PurchaseReport;
import com.sportyshoes.webservice.service.PurchaseReportService;

@RestController
public class PurchaseReportSearchController {
 
	@Autowired
	PurchaseReportService service;
	
	@GetMapping("/PurchaseReport")
	public List<PurchaseReport> getAllPurchaseReports() {
		return service.getAllPurchaseReports();
	}
	
	@GetMapping("/PurchaseReport/PurchaseReportCategory/{PurchaseReportCategory}")
	public List<PurchaseReport> getAllPurchaseReportsByPurchaseReportCategory(@PathVariable String PurchaseReportCategory) {
		return service.getAllPurchaseReportsByPurchaseReportCategory(PurchaseReportCategory);
	}
	
	@GetMapping("/PurchaseReport/PurchaseReportDate/{PurchaseReportDate}")
	public List<PurchaseReport> getAllPurchaseReportsByPurchaseReportDate(@PathVariable String PurchaseReportDate) {  
		return service.getAllPurchaseReportsByPurchaseReportDate(PurchaseReportDate);
	}
	
}
