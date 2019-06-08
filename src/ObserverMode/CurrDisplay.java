package ObserverMode;

public class CurrDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrDisplay(Subject we) {
		weatherData=we;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrDisplay+=="+temperature+"---"+humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}

}
