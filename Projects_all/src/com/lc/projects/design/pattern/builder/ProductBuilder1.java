package com.lc.projects.design.pattern.builder;

import com.lc.projects.design.pattern.builder.entity.Product;
import com.lc.projects.design.pattern.builder.entity.Unit1;
import com.lc.projects.design.pattern.builder.entity.Unit2;
import com.lc.projects.design.pattern.builder.entity.Unit3;

public class ProductBuilder1 implements IBuilder {
	Product p = new Product();
	
	Unit1 unit1 = null;
	Unit2 unit2 = null;
	Unit3 unit3 = null;
	
	public void createUnit1(){
		unit1 = new Unit1();
		unit1.setUid("1");
		unit1.setUname("name1");
	}
	
	public void createUnit2(){
		unit2 = new Unit2();
		unit2.setUid("2");
		unit2.setUname("name2");
	}
	
	public void createUnit3(){
		unit3 = new Unit3();
		unit3.setUid("3");
		unit3.setUname("name3");
	}
	
	public Product composite(){
		String id = unit1.getUid()+"-"+unit2.getUid()+"-"+unit3.getUid();
		String name = unit1.getUname()+"-"+unit2.getUname()+"-"+unit3.getUname();
		p.setId(id);
		p.setName(name);
		return p;
	}
	
}
