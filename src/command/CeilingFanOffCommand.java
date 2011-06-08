package command;

public class CeilingFanOffCommand implements Command{
	
	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		this.prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.off();		
	}
	@Override
	public void undo() {		
		if(prevSpeed==this.ceilingFan.HIGH){
			ceilingFan.high();
		}else if(prevSpeed==this.ceilingFan.MEDIUM){
			this.ceilingFan.medium();
		}else if(prevSpeed==this.ceilingFan.LOW){
			this.ceilingFan.low();
		}else if(prevSpeed==this.ceilingFan.OFF){
			this.ceilingFan.off();
		}
	}
}
