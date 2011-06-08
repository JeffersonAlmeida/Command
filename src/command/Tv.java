package command;

public class Tv {
	private int channel;
	private String nome;
	public Tv(String nome, int channel){
		super();
		this.nome = nome;		
		this.channel = channel;
	}
	public void on(){
		System.out.println("TV is ON, Channel :: " + this.getChannel());
	}
	public void off(){
		System.out.println("TV is OFF");
	}
	public void setInputChannel(int channel){
		this.setChannel(channel);
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
