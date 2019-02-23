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
		this.currentSlices = new ArrayList<>();
	}
	
	
	/**
	 * Randomly slice a pizza;
	 */
	public void slicePizza() {
		
		for(int i = 0 ; i < pizza.rows; i++) {
			for(int j = 0; j < pizza.cols; j++) {
				
				List<Slice> slices = giveValidSlices(new Coordinate(i, j));
				
				if(slices.size() > 0 ) {
					System.out.println("Adding to the pizza	" + slices.get(0));
					currentSlices.add(slices.get(0));
				}
			}
		}
		
		
	}

	/**
	 * Given a set of coordinates, return a validSlice
	 * @param coordinate
	 */
	public List<Slice> giveValidSlices(Coordinate coordinate) {
		List<Slice> slices = this.shapeManager.getAllPossibleSlices(coordinate);
		List<Slice> semiValidSlices = new ArrayList<>();
		List<Slice> validSlices = new ArrayList<>();

		//1. number Of Ingredients
		for(Slice slice : slices) {
			if(slice.hasCorrectNumberOfIngredients()) {
				semiValidSlices.add(slice);
			}
		}
		
		System.out.println("Found semi valid " + semiValidSlices.size());
		
		if(currentSlices.size() == 0) {
			return semiValidSlices;
		}
		
		//2. No overlap with other slices
		for(Slice slice : semiValidSlices) {
			boolean overlap = false;
			for(Slice pizzaSlice : currentSlices) {
				if(pizza.hasOverlap(pizzaSlice, slice)) {
					overlap = true;
				}
			}
			
			if(!overlap) 
				validSlices.add(slice);

		}
		
		return validSlices;
	}

}
