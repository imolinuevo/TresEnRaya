package all;

public class Turn {

	private int value;

	public Turn() {
		value = 0;
	}

	public int take() {
		int result = value;
		value = (value + 1) % 2;
		return result;
	}
	
    public int notTake() {
    	return (value +1)% 2;
    }

}
