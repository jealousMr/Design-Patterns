package SingletonMode;

public class LazySingleton {
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("creates");
	}
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			instance=new LazySingleton();
		}
		return instance;
	}
	public synchronized static LazySingleton getInstance2() {
		if(instance==null) {
			instance=new LazySingleton();
		}
		return instance;
	}
	
	public static void main(String[]args) {
		LazySingleton l=LazySingleton.getInstance();
	}
}
