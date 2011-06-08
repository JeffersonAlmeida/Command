package command;

public class CeilingFanHighCommand implements Command{
	private CeilingFan ceilingFan;
	private int prevSpeed;
	public CeilingFanHighCommand(CeilingFan c){
		super();
		this.ceilingFan = c;
	}
	@Override
	public void execute() {
		this.prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.high();		
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
