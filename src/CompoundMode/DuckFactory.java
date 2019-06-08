package CompoundMode;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}

}
