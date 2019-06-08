package CompoundMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Observable implements QuackObservable{
	ArrayList obs=new ArrayList();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {this.duck=duck;}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		obs.add(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Iterator it=obs.iterator();
		while(it.hasNext()) {
			Observer ob=(Observer) it.next();
			ob.update(null, duck);
		}
	}

}
