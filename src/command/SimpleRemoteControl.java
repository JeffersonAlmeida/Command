package command;

public class SimpleRemoteControl {
	private Command slot;
	public SimpleRemoteControl(){
		super();
	}
	public void setCommand(Command slot){
		this.slot = slot;
	}
	public void buttonWasPressed(){
		this.slot.execute();
	}
}
