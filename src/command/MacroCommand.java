package command;

public class MacroCommand implements Command{
	private Command[] commands;
	
	public MacroCommand(Command[] commands){
		this.commands = commands;
	}
	public void setCommands(Command[] commands) {
		this.commands = commands;
	}

	public Command[] getCommands() {
		return commands;
	}

	@Override
	public void execute() {		
		for(Command command: commands){
			command.execute();
		}
	}

	@Override
	public void undo() {
				
	}
}
