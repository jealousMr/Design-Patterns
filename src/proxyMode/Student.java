package proxyMode;

public class Student implements Person{
	private String name;
	
	public Student(String n) {
		name=n;
	}

	@Override
	public void giveMoney() {
		// TODO Auto-generated method stub
		System.out.println(name+"…œΩª10");
	}

}
