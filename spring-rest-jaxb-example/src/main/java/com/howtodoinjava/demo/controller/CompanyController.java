package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Company;
import com.howtodoinjava.demo.model.CompanyList;

@RestController
public class CompanyController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CompanyController.class);
	
	
	@RequestMapping(value="/companies", method=RequestMethod.GET, produces = {"application/xml"}, headers = {"Accept=application/xml"})
	public ResponseEntity<CompanyList> getCompanyList(){
		LOGGER.debug("~~~ Get All Companies ~~~");
				
		Company company = new Company();
		company.setId(1);
		company.setCeoName("John");
		company.setCompanyName("IBM");
		company.setNoEmp(123456);
		
		Company company1 = new Company();
		company1.setId(2);
		company1.setCeoName("Andrew");
		company1.setCompanyName("Accenture");
		company1.setNoEmp(123456);
		
		Company company2 = new Company();
		company2.setId(3);
		company2.setCeoName("Michael");
		company2.setCompanyName("Cognizant");
		company2.setNoEmp(123456);
		
		Company company3 = new Company();
		company3.setId(4);
		company3.setCeoName("Shaun");
		company3.setCompanyName("Oracle");
		company3.setNoEmp(123456);
		
		CompanyList companyList = new CompanyList();
		companyList.getCompanies().add(company);
		companyList.getCompanies().add(company1);
		companyList.getCompanies().add(company2);
		companyList.getCompanies().add(company3);
				
		return new ResponseEntity<CompanyList>(companyList, HttpStatus.OK);
	}
}

