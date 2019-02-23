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
			Slice slice = new Slice(pizza);
			slice.start = coordinate;
			slice.end = new Coordinate(coordinate.x + shape.colSize, coordinate.y + shape.rowSize);
			
			if(slice.end.x >= pizza.cols || slice.end.y >= pizza.rows) {
				continue;
			}
			
			possibleSlices.add(slice);
		}
		
		return possibleSlices;
	}

	public List<Shape> getAllPossibleShapes() {
		List<Shape> possibleShapes = new ArrayList<>();
		// rectangles of each shape and size
        for (int rowSize = 0; rowSize < pizza.maxNumberCells + 1; rowSize++) 
        {
            for (int columnSize = 0; columnSize <  pizza.maxNumberCells +1; columnSize++)
            {
                if( rowSize * columnSize <=  pizza.maxNumberCells &&  rowSize * columnSize >=  pizza.minimumNumberOfIngredients * 2  )
                {
                   // System.out.println("size adding: " + (rowSize-1) + " x " + (columnSize-1));
                    possibleShapes.add(new Shape(rowSize-1, columnSize-1));
                }
            }
        }
        
        return possibleShapes;
	}
	
}
