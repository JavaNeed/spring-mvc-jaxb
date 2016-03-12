package com.howtodoinjava.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="companies")
public class CompanyList {
	private List<Company> companies = new ArrayList<>();

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
}
