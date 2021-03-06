package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import domain.Pizza;

public class PizzaInputReader {
	
	public static Pizza readPizzaFile(String name) {
	        try {
	            Path path = Paths.get(name);
	            Path absolutePath = path.toAbsolutePath();
	            List<String> lines = Files.readAllLines(absolutePath);
	            
	            
	            String[] constraints = lines.get(0).split(" ");
	            lines.remove(0);
	            
	            int row = Integer.valueOf(constraints[0]);
	            int col = Integer.valueOf(constraints[1]);
	            int numberOfIngredients = Integer.valueOf(constraints[2]);
	            int maxNumberCells = Integer.valueOf(constraints[3]);
	            
	            Pizza pizza = new Pizza(row,col,numberOfIngredients, maxNumberCells);

	            
	            for(int i = 0; i < lines.size(); i++) {
	            	for(int j = 0; j < lines.get(i).length(); j++) {
	            		pizza.pizzaToppings[j][i] = lines.get(i).charAt(j); 
	            	}
	            }
	            
	            return pizza;
	            
	        }
	        catch (IOException ex) {
	            Logger.getLogger(PizzaInputReader.class.getName()).log(Level.SEVERE, null, ex);
	        }
			return null;
	}
}
