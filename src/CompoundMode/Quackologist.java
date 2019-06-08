package CompoundMode;

import java.util.Observable;

public class Quackologist implements Observer, java.util.Observer{

	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println(duck);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(o);
	}

}
