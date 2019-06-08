package StrategyMode;

public class TestDuck extends Duck{
	public TestDuck() {
		super.speak=new BigSay();
	}

	@Override
	public void display() {
		System.out.println("test duck");
	}
	
	public static void main(String[]args) {
		Duck d=new TestDuck();
		d.say();
		d.setSpeak(new SmallSay());
		d.say();
	}

}
