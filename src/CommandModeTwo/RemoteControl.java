package CommandModeTwo;

public class RemoteControl {
	
	private Command[] onCommands;
	private Command[] offCommands;
	
	public RemoteControl() {
		onCommands=new Command[2];
		offCommands=new Command[2];
	}
	
	public void setCommand(int slot , Command onCommand,Command offCommand) {
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	public void onBtn(int slot) {
		onCommands[slot].execute();
	}
	public void offBtn(int slot) {
		offCommands[slot].execute();
	}
	
	
	public static void main(String[]args) {
		RemoteControl remote=new RemoteControl();
		
		Light light=new Light();
		TV tv=new TV();
		
		LightOnCommand lightoncommand=new LightOnCommand();
		lightoncommand.setLight(light);
		LightOffCommand lightoffcommand=new  LightOffCommand();
		lightoffcommand.setLight(light);
		
		TVOnCommand tvoncommand=new TVOnCommand();
		tvoncommand.setTv(tv);
		TVOffCommand tvoffcommand=new TVOffCommand();
		tvoffcommand.setTv(tv);
		
		remote.setCommand(0,lightoncommand , lightoffcommand);
		remote.setCommand(1, tvoncommand, tvoffcommand);
		
		remote.onBtn(0);
		remote.offBtn(0);
		remote.onBtn(1);
		remote.offBtn(1);
	}

}
