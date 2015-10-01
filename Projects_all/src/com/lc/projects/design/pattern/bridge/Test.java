package com.lc.projects.design.pattern.bridge;

public class Test {
	public static void main(String[] args) {
		IPost post = new SafePost();
		Letter letter = new Letter(post);
		letter.post();
		
		Parcle parcle = new Parcle(post);
		parcle.post();
	}
}
