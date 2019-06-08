package CommandModeTwo;

public class LightOnCommand implements Command{
	
	private Light light;

	public void setLight(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	
}
