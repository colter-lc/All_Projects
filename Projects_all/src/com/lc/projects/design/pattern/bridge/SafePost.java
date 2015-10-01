package com.lc.projects.design.pattern.bridge;

public class SafePost implements IPost {

	@Override
	public void post() {
		System.out.println("safe post...");
	}

}
