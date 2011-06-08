package command;

public class Light {
	private String nome;
	public Light(String nome){
		super();
		this.setNome(nome);
	}
	public void on(){
		System.out.println("The Light is ON");
	}
	public void off(){
		System.out.println("The Light is OFF");
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
