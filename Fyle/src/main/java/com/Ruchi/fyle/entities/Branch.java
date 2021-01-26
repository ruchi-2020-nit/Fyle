package com.Ruchi.fyle.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Branch {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_id;
	private String ifsc;
	@Id
	private int bank_id;
	private String branch;
	private String address;
	private String city;
	private String district;
	private String state;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="bank_id")
	private Banks bank;

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Banks getBank() {
		return bank;
	}

	public void setBank(Banks bank) {
		this.bank = bank;
	}
	
	public Branch() {
		
	}

	public Branch(String ifsc, int bank_id, String branch, String address, String city, String district, String state,
			Banks bank) {
		super();
		this.ifsc = ifsc;
		this.bank_id = bank_id;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
		this.bank = bank;
	}

}
