package stateMode;

public class NoQuarterState implements State{
	Machine m;
	public NoQuarterState(Machine m) {
		this.m=m;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("insert");
		m.setState(m.getHasQuarterState());
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		System.out.println("ej");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("tu");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("f");
	}

	
}
