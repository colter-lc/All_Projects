package com.lc.projects.design.pattern.builder;

import com.lc.projects.design.pattern.builder.entity.Product;

public interface IBuilder {
	public void createUnit1();
	public void createUnit2();
	public void createUnit3();
	public Product composite();
}
