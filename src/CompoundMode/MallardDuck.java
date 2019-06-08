package CompoundMode;

import java.util.Observer;

public class MallardDuck implements Quackable{

	Observable ob;
	public MallardDuck() {
		ob=new Observable(this);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("QUACK");
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		ob.registerObserver(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		ob.notifyObservers();
	}

}
