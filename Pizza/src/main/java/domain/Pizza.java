package domain;

import java.util.Arrays;

public class Pizza {
	public char[][] pizzaToppings;
	public int rows;
	public int cols;
	public int minimumNumberOfIngredients;
	public int maxNumberCells;
	
	public Pizza(int row, int col, int numberOfIngredients, int maxNumberCells) {
		this.rows = row;
		this.cols = col;
		this.minimumNumberOfIngredients = numberOfIngredients;
		this.maxNumberCells = maxNumberCells;
		this.pizzaToppings = new char[cols][rows];
	}
	

	@Override
	public String toString() {
		return "Pizza [pizzaToppings=" + Arrays.deepToString(pizzaToppings) + ", rows=" + rows + ", cols=" + cols
				+ ", numberOfIngredients=" + minimumNumberOfIngredients + ", maxNumberCells=" + maxNumberCells + "]";
	}

	public boolean hasOverlap(Slice slice1, Slice slice2) {
		//System.out.println(slice1);
		//System.out.println(slice2);
		
		if(slice1.start.x > slice2.end.x || slice2.start.x > slice1.end.x) {
			//System.out.println("false");
			return false;
		}
		if(slice1.start.y > slice2.end.y || slice2.start.y > slice1.end.y) {
			//System.out.println("false");
			return false;
		}

		//System.out.println("true");
		
		return true;
	}

	
	
	
	
}
