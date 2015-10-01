package com.lc.projects.design.pattern.observer;

public class Observer2<T> implements IObserver<T> {

	@Override
	public void refresh(T data) {
		System.out.println("Oberser two :I received data:"+data);
	}

}
