package CommandModeTwo;

public class MacroCommand implements Command{
	
	Command[] coms;
	
	public MacroCommand(Command[] c) {
		coms=c;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0;i<coms.length;i++)
			coms[i].execute();
	}

	
}
