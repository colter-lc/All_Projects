package com.lc.projects.design.pattern.factory;

public class SimpleCarFactory {
	public static ICar1 create(int type) {
		ICar1 object = null;

		switch (type) {
		case ICar1.TOP_CAR:
			object = new TopCar1();
			break;
		case ICar1.MIDDLE_CAR:
			object = new MiddleCar1();
			break;
		case ICar1.LOW_CAR:
			object = new LowCar1();
			break;
		}
		
		return object;
	}
}
