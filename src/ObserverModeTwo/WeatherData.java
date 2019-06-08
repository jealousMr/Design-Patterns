package ObserverModeTwo;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temp;
	
	public void change() {
		super.setChanged();
		super.notifyObservers();
	}
	public void setAll(float tem) {
		temp=tem;
		change();
	}
	public float getTemp() {
		return temp;
	}

}
