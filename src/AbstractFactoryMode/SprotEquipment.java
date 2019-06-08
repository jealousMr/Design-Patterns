package AbstractFactoryMode;
//�����ͬ���͹���
public class SprotEquipment implements Equipment{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		Car a=new SportCar();
		return a;
	}

	@Override
	public BackPack createBackPack() {
		// TODO Auto-generated method stub
		BackPack b=new SportBackPack();
		return b;
	}
	
	
}
