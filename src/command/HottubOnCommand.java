package command;

public class HottubOnCommand implements Command {
	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub){
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		this.hottub.on();
	}

	@Override
	public void undo() {
		
	}
	
}
