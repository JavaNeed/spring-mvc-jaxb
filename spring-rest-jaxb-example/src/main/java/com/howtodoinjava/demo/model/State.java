package com.howtodoinjava.demo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="state")
@XmlAccessorType(XmlAccessType.NONE)
public class State implements Serializable{
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name = "code")
	private String code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
