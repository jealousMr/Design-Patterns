package CompoundMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Flock implements Quackable{
	Observable ob;
	public Flock() {
		ob=new Observable(this);
	}
	ArrayList quackers=new ArrayList();
	public void add(Quackable q) {
		quackers.add(q);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator it=quackers.iterator();
		while(it.hasNext()) {
			Quackable q=(Quackable) it.next();
			q.quack();
		}
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
