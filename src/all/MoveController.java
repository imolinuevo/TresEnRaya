package all;

public class MoveController extends UserActionController {

	public MoveController(Board board, Player player) {
		super(board, player);
	}

	@Override
	void writeActionDescription(IO io, Player player) {
		io.writeln("Mueve el jugador " + player.getToken());
		
	}

	@Override
	void actionBody(boolean ok, Player player, Board board, IO io) {
		Coordinate origin = new Coordinate();
		Coordinate target = new Coordinate();
		do {
			io.writeln("De qué casilla?");
			origin.read();
			ok = board.full(origin, player.getToken());
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			io.writeln("A qué casilla?");
			target.read();
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(origin, '_');
		board.put(target, player.getToken());
		
	}
}
