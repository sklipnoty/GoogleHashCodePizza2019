package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import domain.Slice;

public class PizzaOutputWriter {

	public static void writeResults(String filename, List<Slice> solution) {
		try {
			PrintWriter writer = new PrintWriter(filename);
			writer.println(solution.size());
			for(Slice slice :solution) {
				writer.println(slice.start.solutionToString() + slice.end.solutionToString());
			}
			
			writer.flush();
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
