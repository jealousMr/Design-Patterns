package IteratorMode;

public class Dinner {
	static final int MAX=6;
	int number=0;
	MenuItem[] menu;
	
	public Iterator createIterator() {
		return new DinnerIterator(menu);
	}
	
	public static void main(String[]args) {
		Iterator i=new Dinner().createIterator();
		i.next();
	}
}
