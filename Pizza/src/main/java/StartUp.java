import domain.Coordinate;
import domain.Pizza;
import domain.PizzaSolution;
import domain.Slice;
import io.PizzaInputReader;
import io.PizzaOutputWriter;

public class StartUp {
	public static void main(String args[]) {
		Pizza p = PizzaInputReader.readPizzaFile("resources/c_medium.in");
		System.out.println(p);
		PizzaSolution ps = new PizzaSolution(p);
	//	ps.currentSlices.add(new Slice(p, new Coordinate(0, 0), new Coordinate(2, 1)));
		ps.slicePizza();
		System.out.println("Pizza = " +ps.currentSlices);
		PizzaOutputWriter pow = new PizzaOutputWriter();
		pow.writeResults("resources/solutionc.txt", ps.currentSlices);
	} 
}
