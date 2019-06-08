package combinationMode;

public class MenuItem extends MenuComponent{
	String name;
	
	public MenuItem(String n) {
		name=n;
	}
	public String getName() {return name;}
	public void setName(String n) {name=n;}
	public void print() {
		System.out.println("По=="+name);
	}
}
