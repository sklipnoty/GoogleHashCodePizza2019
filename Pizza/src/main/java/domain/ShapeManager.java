package domain;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
	private Pizza pizza;
	
	public ShapeManager(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public List<Slice> getAllPossibleSlices(Coordinate coordinate) {
		List<Slice> possibleSlices = new ArrayList<>();
		List<Shape> allPossibleShapes = getAllPossibleShapes();
		
		 
		for(Shape shape : allPossibleShapes) {
			
		}
		
		
		
		
		return null;
	}

	public List<Shape> getAllPossibleShapes() {
		List<Shape> possibleShapes = new ArrayList<>();
		// rectangles of each shape and size
        for (int rowSize = 1; rowSize < pizza.maxNumberCells + 1; rowSize++) 
        {
            for (int columnSize = 1; columnSize <  pizza.maxNumberCells +1; columnSize++)
            {
                if( rowSize * columnSize <=  pizza.maxNumberCells &&  rowSize * columnSize >=  pizza.numberOfIngredients * 2  )
                {
                    System.out.println("size adding: " + rowSize + " x " + columnSize);
                    possibleShapes.add(new Shape(rowSize, columnSize));
                }
            }
        }
        
        return possibleShapes;
	}
	
}
