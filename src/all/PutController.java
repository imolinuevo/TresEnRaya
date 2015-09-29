package all;

public class PutController extends ColocateController {

	public PutController(Board board, Player player) {
		super(board, player);
	}
	
	@Override
	void writeActionDescription(IO io, Player player) {
		new PutView().showActionDescription(io, player);
	}

	@Override
	void actionBody(boolean ok, Player player, Board board, IO io) {
		Coordinate coordinate = new Coordinate();
		do {
			new PutView().askCoordinate(io);
			coordinate.read();
			ok = board.empty(coordinate);
			if (!ok) {
				new PutView().alertNotEmptyCoordinate(io);
			}
		} while (!ok);
		board.put(coordinate, player.getToken());
	}
}
