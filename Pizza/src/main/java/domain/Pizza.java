package domain;

public class Pizza {
	protected char[][] pizzaToppings;
	protected int rows;
	protected int cols;
	protected int numberOfIngrediants;
	protected int maxNumberCells;
	
	public Pizza(int row, int col, int numberOfIngredients, int maxNumberCells) {
		this.rows = row;
		this.cols = col;
		this.numberOfIngrediants = numberOfIngredients;
		this.maxNumberCells = maxNumberCells;

	}

	
	
	
}
