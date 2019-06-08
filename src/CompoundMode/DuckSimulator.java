package CompoundMode;

import java.util.Observer;

public class DuckSimulator {
	void simulate(AbstractDuckFactory df) {
		Quackable md=df.createMallardDuck();
		Quackable rd=df.createRedheadDuck();
		Quackable goose=new GooseAdapter(new Goose());
		Flock f=new Flock();
		f.add(md);
		f.add(rd);
		f.add(goose);
		Flock r=new Flock();
		Quackable r1=df.createRedheadDuck();
		Quackable r2=df.createRedheadDuck();
		Quackable r3=df.createRedheadDuck();
		Quackable r4=df.createRedheadDuck();
		r.add(r1);
		r.add(r2);
		r.add(r3);
		r.add(r4);
		Observer lo=new Quackologist();
		f.registerObserver(lo);
		simulate(f);
		simulate(r);
		System.out.println("ci=="+QuackCounter.getQuacks());
	}
	void simulate(Quackable q) {
		q.quack();
	}
	
	public static void main(String[]args) {
		DuckSimulator s=new DuckSimulator();
		AbstractDuckFactory df=new CountingDuckFactory();
		s.simulate(df);
	}
}
