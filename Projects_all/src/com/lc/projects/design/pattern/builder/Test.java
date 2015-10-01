package com.lc.projects.design.pattern.builder;

import com.lc.projects.design.pattern.builder.entity.Product;

public class Test {
	public static void main(String[] args) {
		IBuilder builder = new ProductBuilder3();
		Director director = new Director(builder);
		Product p = director.build();
		System.out.println(p);
	}
}
