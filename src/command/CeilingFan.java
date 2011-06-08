package command;

public class CeilingFan {
	public static final int HIGH = 3 ;
	public static final int MEDIUM = 2 ;
	public static final int LOW = 1 ;
	public static final int OFF = 0;
	
	private int speed;
	
	public CeilingFan(){
		super();
		this.speed = OFF;
	}
	public void high(){
		System.out.println(" CeilingFan HIGH");
		this.speed = HIGH;
	}
	public void medium(){
		System.out.println(" CeilingFan MEDIUM");
		this.speed = MEDIUM;
	}
	public void low(){
		System.out.println(" CeilingFan LOW");
		this.speed = LOW;
	}
	public void off(){
		System.out.println(" CeilingFan OFF");
		this.speed = OFF;
	}
	public int getSpeed(){
			return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
