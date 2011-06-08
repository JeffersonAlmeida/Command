package command;

public class CeilingFanOnCommand implements Command{

	private CeilingFan ceilingFan;
	public CeilingFanOnCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		this.ceilingFan.high();
	}

}
