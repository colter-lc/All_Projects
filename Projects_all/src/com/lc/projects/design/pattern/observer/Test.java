package com.lc.projects.design.pattern.observer;

public class Test {
	public static void main(String[] args) {
		IObserver<String> observer = new Observer<String>();
		IObserver<String> observer1 = new Observer1<String>();
		IObserver<String> observer2 = new Observer2<String>();
		
		Subject<String> subject = new Subject<String>();
		
		subject.register(observer);
		subject.register(observer1);
		subject.register(observer2);
		
		subject.setData("test message");
		subject.notifyObservers();
		
		System.out.println("---------------------");
		subject.unregister(observer1);
		subject.setData("test 2");
		subject.notifyObservers();
	}
}
