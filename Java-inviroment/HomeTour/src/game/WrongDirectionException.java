package game;

public class WrongDirectionException extends Exception{
	@Override
	public String getMessage() {
		return "Wrong direction! " + "This side of home is not accessable."
				+ '\n' + " You can only visit the north,"
				+ " south or east side of the home!";
	}
}
