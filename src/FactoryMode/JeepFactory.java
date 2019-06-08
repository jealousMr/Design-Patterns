package FactoryMode;

public class JeepFactory implements Factory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new JeepCar();
	}

	
	
	public static void main(String[]args) {
		Factory factory=new SprotFactory();
		Car c=factory.createCar();
		c.getCar();
	}
}
