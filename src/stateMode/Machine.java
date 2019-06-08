package stateMode;

public class Machine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state=soldOutState;
	int count =0;
	public Machine(int num) {
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new  HasQuarterState(this);
		soldState=new SoldState(this);
		count=num;
		if(num>0)
			state=noQuarterState;
	}
	public State getSoldOutState() {return soldOutState;}
	public State getNoQuarterState() {return noQuarterState;}
	public State getHasQuarterState() {return hasQuarterState;}
	public State getSoldState() {return soldState;}
	public void insert() {
		state.insert();
	}
	public void eject() {
		state.eject();
	}
	public void turn() {
		state.turn();
	}
	public void setState(State s) {
		state=s;
	}
}
