package com.lc.projects.design.pattern.observer;

public class Observer1<T> implements IObserver<T> {

	@Override
	public void refresh(T data) {
		System.out.println("Oberser one :I received data:"+data);
	}

}
