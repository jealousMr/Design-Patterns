package DecorateMode;

public class Milk extends CondimentDecorator{
	Beverage beverage;
	
	public Milk(Beverage b) {
		beverage=b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"+Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.88+beverage.cost();
	}
	
	public static void main(String[]args) {
		Beverage b=new Espresso();
		Beverage b2=new HouseBlend();
		System.out.println(b.description+"cost is="+b.cost());
		
		b=new Milk(b);
		b=new Milk(b);
		System.out.println(b.description+"cost is="+b.cost());
		
		b2=new Milk(b2);
		b2=new Mocha(b2);
		System.out.println(b2.description+"cost is="+b2.cost());
	}

}
