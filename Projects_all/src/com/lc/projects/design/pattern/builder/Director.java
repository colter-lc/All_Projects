package com.lc.projects.design.pattern.builder;

import com.lc.projects.design.pattern.builder.entity.Product;

public class Director {
	private IBuilder builder;
	
	public Director(IBuilder builder){
		this.builder = builder;
	}
	
	public Product build(){
		builder.createUnit1();
		builder.createUnit2();
		builder.createUnit3();
		return builder.composite();
	}
	
}
