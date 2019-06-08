package SingletonMode;

public class HungrySingleton {
	private static HungrySingleton instance=new HungrySingleton();
	
	public static HungrySingleton getInstance() {
		return instance;
	}
	private HungrySingleton() {
		System.out.println("create");
	}
	
	
	
	public static void main(String[]args) {
		HungrySingleton h=HungrySingleton.getInstance();
	}
}
