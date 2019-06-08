package DecorateMode;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage b) {
		beverage=b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"+Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.34+beverage.cost();
	}

}
