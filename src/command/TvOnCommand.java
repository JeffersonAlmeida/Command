package command;

public class TvOnCommand implements Command{
	private Tv tv;
	public TvOnCommand(Tv tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		this.tv.on();
		this.tv.setChannel(7);
	}

	@Override
	public void undo() {
				
	}
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	public Tv getTv() {
		return tv;
	}

}
