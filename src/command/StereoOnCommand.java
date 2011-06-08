package command;

public class StereoOnCommand implements Command{
	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo){
		this.stereo = stereo;
	}
	public void setStereo(Stereo stereo) {
		this.stereo = stereo;
	}

	public Stereo getStereo() {
		return stereo;
	}

	@Override
	public void execute() {
		this.stereo.on();
		this.stereo.setCd();
		stereo.setVolume(11);
	}
	
	
}
