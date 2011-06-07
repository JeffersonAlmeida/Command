package command;

public class CommandTest {

	public static void main(String[] args) {
		Light light = new Light();
		CommandOnLight commandOnLight = new CommandOnLight(light);
		commandOnLight.execute();
	}

}
