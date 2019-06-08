package RIM;

import java.rmi.Naming;

public class Client {
	public static void main(String[]args) {
		try {
			MyRemote m=(MyRemote) Naming.lookup("rmi://127.0.0.1/hello");
			String s=m.say();
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
