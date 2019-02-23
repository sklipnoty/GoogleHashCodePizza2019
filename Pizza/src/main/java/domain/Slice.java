package domain;

public class Slice {
	private Pizza pizza;
	private Coordinate start;
	private Coordinate end;
	
	public Slice(Pizza pizza) {
		this.pizza = pizza;
	}
	
	/**
	 * The slices we want to cut out must contain at least L cells of each ingredient (that is, at least L cells of
		mushroom and at least L cells of tomato) and at most H cells of any kind in total ­ surprising as it is, there is
		such a thing as too much pizza in one slice.
	 * @return
	 */
	private boolean isValidSlice() {
		return false;
	}
}
