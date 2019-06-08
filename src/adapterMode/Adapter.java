package adapterMode;

public class Adapter implements Duck{
	private Turkey t;
	
	public Adapter(Turkey t) {
		this.t=t;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		t.gob();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		t.fly();
	}

	public static void main(String[]args) {
		Duck duck=new RealDuck();
		Turkey turkey=new RealTurkey();
		Adapter a=new Adapter(turkey);
		duck.quack();
		a.quack();
	}
	
}
