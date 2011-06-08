package command;

public class TvOffCommand implements Command{
	private Tv tv;
	
	public TvOffCommand(Tv tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		this.tv.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
