package command;

public class LightOnCommand implements Command {
	private Light light;
	public LightOnCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.on();
	}
	public void setLight(Light light) {
		this.light = light;
	}
	public Light getLight() {
		return light;
	}
	@Override
	public void undo() {
		this.light.off();
	}
	
}
