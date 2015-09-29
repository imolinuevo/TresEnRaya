package all;

public class StartController {

	private Board board;
	
	public StartController(Board board) {
		this.board = board;
	}

	public void control() {
		board.write();
	}
}
