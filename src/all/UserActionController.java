package all;

abstract class UserActionController {
	
	private Board board;
	
	private Player player;

	public UserActionController(Board board, Player player) {
		this.board = board;
		this.player = player;
	}
	
	abstract void writeActionDescription(IO io, Player player);
	abstract void actionBody(boolean ok, Player player, Board board, IO io);
	
	public void control() {
		IO io = new IO();
		writeActionDescription(io, player);
		boolean ok = false;
		actionBody(ok, player, board, io);
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
}
