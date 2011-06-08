package command;

public class CommandTest {
	
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Light");
		LightOnCommand commandOnLight = new LightOnCommand(light);
		remote.setCommand(commandOnLight);
		remote.buttonWasPressed();	
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
		remote.setCommand(garageDoorOnCommand);
		remote.buttonWasPressed();
	}

}
