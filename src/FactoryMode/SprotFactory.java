package FactoryMode;

public class SprotFactory implements Factory{
	public Car createCar() {
		return new SportCar();
	}
}
