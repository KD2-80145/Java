package com.app.fruits;

public class Orange extends Fruit{

	public Orange(String name)
	{
		super(name);
	}
	@Override
	public void acceptData() {
		super.acceptData();
	}
	
	@Override
	public String taste()
	{
		return "Sour";
	}
	
}
