package command;

import java.util.Arrays;

public class RemoteControl {
	
	private Command[] onCommands;
	private Command[] offCommands;
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
	public RemoteControl(){
		onCommands = new Command[RemoteControl.maxCommands];
		offCommands = new Command[RemoteControl.maxCommands];
		
		Command noCommand = new NoCommand();
		for(int i = 0 ; i<RemoteControl.maxCommands;i++){
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
	}
	public void offButtonWasPushed(int slot){
		this.offCommands[slot].execute();
	}
	public static int getMaxcommands() {
		return maxCommands;
	}
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n *** Remote Control *** \n");
		for(int i=0; i< RemoteControl.maxCommands; i++){
			stringBuffer.append("[Slot " + i+"]"+" = " + onCommands[i].getClass().getName()+ "    " + offCommands[i].getClass().getName()+"\n");
		}
		return stringBuffer.toString();
	}	
}
