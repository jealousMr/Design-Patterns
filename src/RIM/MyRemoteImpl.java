package RIM;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String say() throws RemoteException {
		// TODO Auto-generated method stub
		return "hello yet";
	}
	
	public static void main(String[]args) {
		try {
			MyRemote m=new MyRemoteImpl();
			Naming.rebind("hello", m);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
