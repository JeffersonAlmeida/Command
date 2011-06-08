package command;

public class StereoOffCommand implements Command{
	private Stereo stereo;
	public StereoOffCommand(Stereo stereo){
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
		this.stereo.off();		
	}
	
	
}
