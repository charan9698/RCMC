package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="milk_tab")
public class Milk {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="milk_no_col")
	private Integer milkNo;
	@Column(name="milk_name_col")
	private String milkName;
	@Column(name="milk_address_col")
	private String milkAdress;
	@Column(name="milk_email_col")
	private String milkEmail;

}
