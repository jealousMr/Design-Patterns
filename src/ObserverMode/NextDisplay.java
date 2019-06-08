package ObserverMode;

public class NextDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private float presser;
	private Subject weatherData;
	
	public NextDisplay(Subject we) {
		weatherData=we;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NextDisplay+=="+temperature+"---"+humidity+"pill=="+presser);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temp;
		this.humidity=humidity;
		this.presser=((WeatherData) weatherData).getPressure();
		display();
	}
	
	
	public static void main(String[]args) {
		WeatherData w=new WeatherData();
		CurrDisplay d=new CurrDisplay(w);
		NextDisplay n=new NextDisplay(w);
		w.setMes(0.12f, 1.22f, 0.45f);
		w.setMes(2.12f, 2.22f, 2.45f);
	}
}
