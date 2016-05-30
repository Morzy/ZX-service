package com.lz.test.serviceImpl;

import com.lz.test.model.TestProduct;
import com.lz.test.services.TestService;

public class TestServiceImpl implements TestService{

	@Override
	public Object getCatalogs(String username) throws Exception {
		TestProduct testPrdoct = new TestProduct();
		testPrdoct.setSs("123");
		return testPrdoct;
	}
		
	
	public static void main(String args[]){
		System.out.println("fuck");
	}
}
