package CompoundMode;

import java.util.Observer;

public interface QuackObservable {
	public void registerObserver(Observer o);
	public void notifyObservers();
}
