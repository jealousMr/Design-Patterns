package StrategyMode;

public abstract class Duck {
	protected Speak speak;
	
	public void say() {
		speak.speak();
	}
	public abstract void display();
	public void setSpeak(Speak s) {
		speak=s;
	}
}
