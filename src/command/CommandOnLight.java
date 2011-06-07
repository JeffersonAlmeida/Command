package command;

public class CommandOnLight implements Command {
	private Light light;
	public CommandOnLight(Light light){
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
	
}
