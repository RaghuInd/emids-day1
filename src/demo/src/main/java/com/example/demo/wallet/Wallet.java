package com.example.demo.wallet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Wallet { // POJO : simple plain Old Java Object [will not have any business logic]
	
	@Id
	private Integer id;
	
	private String name;
	private Double balance;
	
	
	public Wallet() {
		super();
	}
	public Wallet(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
