package command;

public class RemoteControlWithUndo {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
		
	private static final int maxCommands = 7;
	
	public void setOnCommands(Command[] onCommands) {
		this.onCommands = onCommands;
	}
	public Command[] getOnCommands() {
		return onCommands;
	}
	public void setOffCommands(Command[] offCommands) {
		this.offCommands = offCommands;
	}
	public Command[] getOffCommands() {
		return offCommands;
	}	
	
	public RemoteControlWithUndo() {
	
		onCommands = new Command[RemoteControlWithUndo.maxCommands];
		offCommands = new Command[RemoteControlWithUndo.maxCommands];
		undoCommand = new NoCommand();
		Command noCommand = new NoCommand();
		for(int i = 0 ; i<RemoteControlWithUndo.maxCommands;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	public void onButtonWasPushed(int slot){
		this.onCommands[slot].execute();
		this.undoCommand = this.onCommands[slot];
	}
	public void offButtonWasPushed(int slot){
		this.offCommands[slot].execute();
		this.undoCommand = this.offCommands[slot];
	}
	public static int getMaxcommands() {
		return maxCommands;
	}
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n *** Remote Control *** \n");
		for(int i=0; i< RemoteControlWithUndo.maxCommands; i++){
			stringBuffer.append("[Slot " + i+"]"+" = " + onCommands[i].getClass().getName()+ "    " + offCommands[i].getClass().getName()+"\n");
		}
		return stringBuffer.toString();
	}
	public void setUndoCommand(Command undoCommand) {
		this.undoCommand = undoCommand;
	}
	public Command getUndoCommand() {
		return undoCommand;
	}
	public void undoButtonWasPushed(){
		this.undoCommand.undo();
	}
}
