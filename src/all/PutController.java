package all;

public class PutController extends ColocateController {

	public PutController(Board board, Player player) {
		super(board, player);
	}
	
	@Override
	void writeActionDescription(IO io, Player player) {
		io.writeln("Pone el jugador " + player.getToken());
		
	}

	@Override
	void actionBody(boolean ok, Player player, Board board, IO io) {
		Coordinate coordinate = new Coordinate();
		do {
			io.writeln("En qué casilla?");
			coordinate.read();
			ok = board.empty(coordinate);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(coordinate, player.getToken());
		
	}
}
