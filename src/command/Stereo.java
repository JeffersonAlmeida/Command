package command;

public class Stereo {
	public Stereo(){
		super();
	}
	public void on(){
		System.out.println("Stereo ON");
	}
	public void off(){
		System.out.println("Stereo OFF");
	}
	public void setCd(){
		System.out.println("Stereo setCD");
	}
	public void setDvd(){
		System.out.println("Stereo setDvd");
	}
	public void setRadio(){
		System.out.println("Stereo setRadio");
	}
	public void setVolume(int v){
		System.out.println("Stereo setVolume " + v);
	}
	
}
