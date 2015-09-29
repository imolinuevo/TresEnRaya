package all;

public class Player {

	char token;

	public Player(char character) {
		token = character;
	}
	
	public char getToken(){
		return token;
	}

	public void win() {
		new IO().writeln("Victoria!!!! " + token + "! " + token + "! " + token + "!!!!! Victoria!!!!");		
	}

}
