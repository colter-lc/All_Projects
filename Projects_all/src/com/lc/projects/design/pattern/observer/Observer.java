package com.lc.projects.design.pattern.observer;

public class Observer<T> implements IObserver<T> {

	@Override
	public void refresh(T data) {
		System.out.println("Oberser :I received data:"+data);
	}

}
