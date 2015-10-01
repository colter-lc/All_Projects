package com.lc.projects.design.pattern.observer;

public interface ISubject<T> {
	public void register(IObserver<T> observer);
	public void unregister(IObserver<T> observer);
	public void notifyObservers();
}
