package com.lc.projects.design.pattern.factroy3.factory;

import com.lc.projects.design.pattern.factroy3.entity.IBus;
import com.lc.projects.design.pattern.factroy3.entity.ICar;

public abstract class AbstractFactory1  extends AbstractFactory{
	public abstract ICar createCar();
	public abstract IBus createBus();
}
