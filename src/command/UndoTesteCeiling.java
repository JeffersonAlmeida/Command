package command;

public class UndoTesteCeiling {

	
	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		CeilingFan ceilingFan = new CeilingFan();
		
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		remoteControlWithUndo.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControlWithUndo.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		
		System.out.println(remoteControlWithUndo);
		
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
		
		remoteControlWithUndo.onButtonWasPushed(1);
		remoteControlWithUndo.offButtonWasPushed(1);
		remoteControlWithUndo.undoButtonWasPushed();
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
		
		
		
		
	}

}
