package domain;

public class Slice {
	public Pizza pizza;
	public Coordinate start;
	public Coordinate end;
	
	public Slice(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public int getSize() {
		int x = (end.x - start.x) + 1;
		int y = (end.y - start.y) + 1;
		return x*y;
	}

	@Override
	public String toString() {
		return "Slice start=" + start + ", end=" + end + "]";
	}

	public boolean hasCorrectNumberOfIngredients() {
		int numberOfTomatoes = 0;
		int numberOfShrooms = 0;
		
		for(int i = start.x; i < end.x+1; i++) {
			for(int j = start.y; j < end.y+1; j++) {			
				if(pizza.pizzaToppings[i][j] == 'T')
					numberOfTomatoes++;
				else if(pizza.pizzaToppings[i][j] == 'M')
					numberOfShrooms++;
			}
		}
		
		if(numberOfTomatoes >= pizza.minimumNumberOfIngredients && numberOfShrooms >= pizza.minimumNumberOfIngredients) 
			return true;
		
		return false;
	}
	
	
	
	
}
