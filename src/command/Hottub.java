package command;

public class Hottub {
	
	private int temperature;
	
	public int getTemperature() {
		return temperature;
	}
	private String nome;
	
	public Hottub(String nome, int temp){
		this.nome = nome;
		this.temperature = temp;
	}
	public void on(){
		System.out.println("Hottub ON");
	}
	public void off(){
		System.out.println("Hottub OFF");
	}
	public void circulate(){
		System.out.println("Hottub Circulate");
	}
	public void jetsOn(){
		System.out.println("Hottub JetsOn");
	}
	public void jetsOFF(){
		System.out.println("Hottub jetsOFF");
	}
	public void setTemperature(int temp){
		this.temperature = temp;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
