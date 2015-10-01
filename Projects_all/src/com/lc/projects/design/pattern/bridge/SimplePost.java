package com.lc.projects.design.pattern.bridge;

public class SimplePost implements IPost{

	@Override
	public void post() {
		System.out.println("simple post...");
	}

}
