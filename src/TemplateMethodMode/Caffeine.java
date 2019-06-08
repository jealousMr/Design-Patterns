package TemplateMethodMode;

public abstract class Caffeine {
	
	void prepare() {
		boilWater();
		brew();
		pourInCup();
		if(cus())
			addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	void boilWater() {
		System.out.println("boiling water");
	}
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	boolean cus() {
		return true;
	}

	public static void main(String[]args) {
		Tea tea=new Tea();
		Coffee coffee=new Coffee();
		tea.prepare();
		coffee.prepare();
	}
}
