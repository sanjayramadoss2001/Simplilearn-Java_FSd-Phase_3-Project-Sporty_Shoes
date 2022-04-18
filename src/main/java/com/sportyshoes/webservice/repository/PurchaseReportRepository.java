package com.sportyshoes.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sportyshoes.webservice.model.Products;
import com.sportyshoes.webservice.model.PurchaseReport;
import com.sportyshoes.webservice.model.User;


@Repository
public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Integer> {
	
	@Query("SELECT us FROM PurchaseReport pr INNER JOIN pr.user us")
	public List<User> findByUserId();
	
	@Query("SELECT pd FROM PurchaseReport pr INNER JOIN pr.product pd")
	public List<Products> findByProductId();
	
	
	public List<PurchaseReport> findByPurchaseReportCategory(String PurchaseReportCategory);
	public List<PurchaseReport> findByPurchaseReportDate(String PurchaseReportDate);

}
