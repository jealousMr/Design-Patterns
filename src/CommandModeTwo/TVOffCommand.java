package CommandModeTwo;

public class TVOffCommand implements Command {
	private TV tv;
	
	public void setTv(TV t) {
		tv=t;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();
	}

	
}
