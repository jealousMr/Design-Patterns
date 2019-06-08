package CompoundMode;

import java.util.Observer;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int num;
	
	public QuackCounter(Quackable d) {
		duck=d;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		num++;
	}
	public static int getQuacks() {
		return num;
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	
}
