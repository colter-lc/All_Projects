package com.lc.projects.design.pattern.bridge;

public abstract class AbstractThings {
	private IPost obj;
	
	public AbstractThings(IPost post){
		this.obj = post;
	}
	
	public void post(){
		obj.post();
	}
}
