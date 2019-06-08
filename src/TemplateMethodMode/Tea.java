package TemplateMethodMode;

public class Tea extends Caffeine{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dring tea");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Dring tea milk hook");
	}

}
