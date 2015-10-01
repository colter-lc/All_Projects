package com.lc.projects.design.pattern.observer1;

public class Test {
	public static void main(String[] args) {
		Subject subject = new Subject();
		MyObserver ob = new MyObserver();
		subject.addObserver(ob);
		subject.setData(" data changed");
		subject.notifyObservers();
	}
}
