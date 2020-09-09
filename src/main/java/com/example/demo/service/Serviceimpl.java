package com.example.demo.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entities;
import com.example.demo.repo.DTO;

@Service
@Transactional
public class Serviceimpl {
	
	
	private DTO repoDto;
	
	
	@Autowired
	public Serviceimpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void SaveCustomerData() throws FileNotFoundException {
		BufferedReader Br = new BufferedReader(new FileReader("src\\main\\resources\\sample_stock_data.csv"));
		
		String line;
		try {
			while((line = Br.readLine()) != null) {
				String [] data = line.split(",");
				entities E = new entities();
				E.setCompanyName(data[0]);
				E.setExchangeName(data[1]);
				E.setStockPrice(data[2]);
				E.setDate(data[3]);
				E.setTime(data[4]);
				
				System.out.println(E);
				//repoDto.save(E);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
