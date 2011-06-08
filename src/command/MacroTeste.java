package command;

public class MacroTeste {

	public static void main(String[] args) {
		
		Light light = new Light("Bedroom");
		Tv tv = new Tv("Tv Bedroom",7);
		Stereo stereo = new Stereo();
		Hottub hottub = new Hottub("Hottub Bedrrom",10);
		
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		TvOffCommand tvOffCommand = new TvOffCommand(tv);
		HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		
		Command partyOn[] = {lightOnCommand,tvOnCommand,hottubOnCommand,stereoOnCommand};
		Command partyOff[] = {lightOffCommand,tvOffCommand,hottubOffCommand,stereoOffCommand};
		
		 MacroCommand macroCommandOn = new MacroCommand(partyOn);
		 MacroCommand macroCommandOff = new MacroCommand(partyOff);
		 
		 RemoteControl remoteControl = new RemoteControl();
		 remoteControl.setCommand(0, macroCommandOn, macroCommandOff);
		 
		 System.out.println(remoteControl);
		 
		 remoteControl.onButtonWasPushed(0);
		 System.out.println("*******");
		 remoteControl.offButtonWasPushed(0);
		 
		 
		
	}

}
