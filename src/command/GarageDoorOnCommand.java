package command;

public class GarageDoorOnCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorOnCommand(GarageDoor gDoor){
		this.garageDoor = gDoor;
	}
	@Override
	public void execute() {
		this.garageDoor.up();
	}

}
