package TemplateMethodMode;

public class Coffee extends Caffeine{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dring coffee");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("add coffee milk hook");
	}
	public boolean cus() {
		return false;
	}

}
