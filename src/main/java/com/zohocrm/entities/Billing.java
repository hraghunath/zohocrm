package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name",length=45,nullable=false)
	private String firstName;//here we used because naems are differrent
	
	@Column(name="last_name",length=45,nullable=false)
	private String lastName;
	
	@Column(name="email",length=128,nullable=false)
	private String email;//defoult email containts length is 255,if the content is mote then 
	//255 then we use @Lob<Large Object >
	
	@Column(name="mobile",length=10,nullable=false,unique=true)
	private String mobile;//here name is not mandatory if we dont give name then automaticallyh calumn name 
	//became mobile 
	
	@Column(name="product",length=128,nullable=false,unique=true)
	private String product;
	
	@Column(name="amount",nullable=false)
	private int amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
