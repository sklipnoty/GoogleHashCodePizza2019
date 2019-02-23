package domain;

import java.util.ArrayList;
import java.util.List;

public class PizzaSolution {
	public Pizza pizza;
	public List<Slice> currentSlices;
	private ShapeManager shapeManager;
	
	public PizzaSolution(Pizza pizza) {
		super();
		this.pizza = pizza;
		this.shapeManager = new ShapeManager(pizza);
	}

	/**
	 * Given a set of coordinates, return a validSlice
	 * @param coordinate
	 */
	public void cutValidSlice(Coordinate coordinate) {
		List<Slice> slices = this.shapeManager.getAllPossibleSlices(coordinate);
		
		
	}

}
