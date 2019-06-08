package CompoundMode;

import java.util.Observer;

public class GooseAdapter implements Quackable{
	Observable ob;
	private Goose g;
	public GooseAdapter(Goose g) {
		this.g=g;
		ob=new Observable(this);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		g.hock();
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
