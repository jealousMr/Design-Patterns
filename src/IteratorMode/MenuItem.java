package IteratorMode;

public class MenuItem {
	String name;
	String des;
	boolean vege;
	double price;
	
	public MenuItem(String name,String des,boolean vege,double price) {
		this.name=name;
		this.des=des;
		this.vege=vege;
		this.price=price;
	}
	public String getName() {return name;}
	public String getDes() {return des;}
	public boolean getVege() {return vege;}
	public double getPrice() {return price;}
	
	public void setName(String n) {
		name=n;
	}
	public void setDes(String d) {des=d;}
	public void setVege(boolean v) {vege=v;}
	public void setPrice(double p) {price=p;}
}
