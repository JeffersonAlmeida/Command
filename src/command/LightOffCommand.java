package command;

public class LightOffCommand implements Command{
	private Light light;
	
	public LightOffCommand(Light light){
		this.setLight(light);
	}
	public void setLight(Light light) {
		this.light = light;
	}
	public Light getLight() {
		return light;
	}
	@Override
	public void execute() {
		this.light.off();		
	}
	@Override
	public void undo() {
		this.light.on();		
	}	
}
