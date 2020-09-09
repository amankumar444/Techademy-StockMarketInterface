package com.example.demo.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Serviceimpl;

@RestController

public class Rest {
	
	
	@Autowired
	private Serviceimpl sr;
	
	
	@RequestMapping("/saveData")
	public void SetCustomerData() throws IOException {
		sr.SaveCustomerData();
	}
	

}
