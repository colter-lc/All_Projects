package com.lc.projects.design.pattern.observer1;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Subject subject = (Subject) o;
		System.out.println("get data:"+subject.getData() + " args:"+arg);
	}

}
