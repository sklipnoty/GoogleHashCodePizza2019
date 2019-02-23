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
	            
	            for(String line : lines) {
	            	System.out.println(line);
	            }
	            
	            
	        }
	        catch (IOException ex) {
	            Logger.getLogger(PizzaInputReader.class.getName()).log(Level.SEVERE, null, ex);
	        }
			return null;
	}
}
