package AbstractFactoryMode;

public class SportCar extends Car {

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Sprot-car";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "red";
	}
	
	
	public static void main(String[]args) {
		Equipment E=new SprotEquipment();
		Car car=E.createCar();
		BackPack b=E.createBackPack();
		car.type();
		b.type();
	}
}
