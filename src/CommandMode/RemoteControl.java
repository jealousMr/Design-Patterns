package CommandMode;

public class RemoteControl {
	Command slot;
	
	public void setCommand(Command c) {
		slot=c;
	}
	public void push() {
		slot.execute();
	}
	
	public static void main(String[]args) {
		RemoteControl c=new RemoteControl();
		Light light=new Light();
		LightOnCommand lon=new LightOnCommand(light);
		c.setCommand(lon);
		c.push();
	}
}
