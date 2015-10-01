package com.lc.projects.design.pattern.observer;

import java.util.Vector;

public class Subject<T> implements ISubject<T>{
	private Vector<IObserver<T>> vector = new Vector<IObserver<T>>();
	
	private T data;
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public void register(IObserver<T> observer) {
		vector.add(observer);
	}

	@Override
	public void unregister(IObserver<T> observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver<T> ob: vector){
			ob.refresh(data);
		}
	}

}
