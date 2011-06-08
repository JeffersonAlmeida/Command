package command;

public class UndoTeste {


	public static void main(String[] args) {

		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		Light livingRoomlight = new Light("livingRoomlight");
		
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomlight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomlight);
		
		remoteControlWithUndo.setCommand(0, lightOnCommand, lightOffCommand);
		
		System.out.println(remoteControlWithUndo);		
		
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
		
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
		
	}

}
