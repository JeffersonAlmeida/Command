package command;

public class RemoteLoader {

	public RemoteLoader(){
		super();
	}
	public static void main(String[] args){
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("livingRoomLight");
		Light kitchenRoomLight = new Light("kitchenRoomLight");
		CeilingFan ceilingFan = new CeilingFan();
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOFF = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOFF = new LightOffCommand(kitchenRoomLight);
		
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
		GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
		
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOFF);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOFF);
		remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);
		remoteControl.setCommand(4, garageDoorOnCommand, garageDoorOffCommand);
				
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}
	
}
