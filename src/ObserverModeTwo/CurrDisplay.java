package ObserverModeTwo;

import java.util.Observable;
import java.util.Observer;

public class CurrDisplay implements Observer,DisplayElement {
	Observable observable;
	private float temp;

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(temp);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof WeatherData) {
			WeatherData w=(WeatherData) arg0;
			temp=((WeatherData) arg0).getTemp();
			display();
		}
	}

}
