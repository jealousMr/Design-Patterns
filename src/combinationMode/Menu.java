package combinationMode;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList munus=new ArrayList();
	String name;
	
	public Menu(String n) {name=n;}
	
	public void add(MenuComponent m) {
		munus.add(m);
	}
	public void remove(MenuComponent m) {
		munus.remove(m);
	}
	public MenuComponent getChild(int i) {
		return (MenuComponent) munus.get(i);
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("²Ëµ¥=="+name);
		Iterator it=munus.iterator();
		while(it.hasNext()) {
			MenuComponent m=(MenuComponent) it.next();
			m.print();
		}
	}

	
	public static void main(String[]args) {
		MenuComponent m1=new Menu("beef1");
		MenuComponent m2=new Menu("beef2");
		MenuComponent m3=new Menu("beef3");
		MenuComponent m4=new Menu("beef4");
		
		MenuComponent all=new Menu("all");
		all.add(m1);
		all.add(m2);
		
		m3.add(m4);
		all.add(m3);
		
		//all.print();
		//m3.print();
	}
}
