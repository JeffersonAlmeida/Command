package command;

public class CeilingFanMediumCommand implements Command{
	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
		this.prevSpeed = this.ceilingFan.OFF;
	}
	@Override
	public void execute() {
		prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.medium();
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
	public void setPrevSpeed(int prevSpeed) {
		this.prevSpeed = prevSpeed;
	}
	public int getPrevSpeed() {
		return prevSpeed;
	}
}
