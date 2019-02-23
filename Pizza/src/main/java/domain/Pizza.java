package domain;

import java.util.Arrays;

public class Pizza {
	public char[][] pizzaToppings;
	public int rows;
	public int cols;
	public int numberOfIngredients;
	public int maxNumberCells;
	
	public Pizza(int row, int col, int numberOfIngredients, int maxNumberCells) {
		this.rows = row;
		this.cols = col;
		this.numberOfIngredients = numberOfIngredients;
		this.maxNumberCells = maxNumberCells;
		this.pizzaToppings = new char[cols][rows];
	}
	

	@Override
	public String toString() {
		return "Pizza [pizzaToppings=" + Arrays.deepToString(pizzaToppings) + ", rows=" + rows + ", cols=" + cols
				+ ", numberOfIngredients=" + numberOfIngredients + ", maxNumberCells=" + maxNumberCells + "]";
	}

	
	
	
	
}
