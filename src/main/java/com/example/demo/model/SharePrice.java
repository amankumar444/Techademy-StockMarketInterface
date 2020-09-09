package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Exchange")
public class SharePrice {

	@Id
	@GeneratedValue()
	private String CompanyId;
	private String companyName;
	private String ExchangeName;
	private String StockPrice;
	private String Date;
	private String Time;
	
}
