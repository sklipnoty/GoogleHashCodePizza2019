package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		
		int score = -1;
		int currentScore = 0;
		List<Slice> bestSolution = null;
		
		for(int p = 0; p < 100; p++) {
			System.out.println("Starting iteration : " +p);
		
			for(int i = 0 ; i < pizza.rows+1; i++) {
				for(int j = 0; j < pizza.cols+1; j++) {
					List<Slice> slices = giveValidSlices(new Coordinate(i, j));
					
					if(slices.size() > 0 ) {
						Random random = new Random();
						currentSlices.add(slices.get(random.nextInt(slices.size())));
					}
				}
			}
			
			for(Slice slice : currentSlices) {
				score += slice.getSize();
			}
			
			if(score > currentScore) {
				bestSolution = new ArrayList<>();
				for(int i = 0; i < currentSlices.size(); i++) {
					bestSolution.add(new Slice(pizza, currentSlices.get(i).start,currentSlices.get(i).end));
				}
				currentScore = score;
				score = 0;
				System.out.println(" New best solution " + currentScore + " " + bestSolution.size());
				currentSlices = new ArrayList<>();
			}
			
			currentSlices = bestSolution;
		
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
