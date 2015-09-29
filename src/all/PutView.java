package all;

public class PutView {

	public void showActionDescription(IO io, Player player) {
		io.writeln("Pone el jugador " + player.getToken());
	}
	
	public void askCoordinate(IO io) {
		io.writeln("En qué casilla?");
	}
	
	public void alertNotEmptyCoordinate(IO io) {
		io.writeln("Esa casilla no está vacía");
	}

}
