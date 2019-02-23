import domain.Coordinate;
import domain.Pizza;
import domain.PizzaSolution;
import io.PizzaInputReader;

public class StartUp {
	public static void main(String args[]) {
		Pizza p = PizzaInputReader.readPizzaFile("resources/a_example.in");
		System.out.println(p);
		PizzaSolution ps = new PizzaSolution(p);
		ps.slicePizza();
		System.out.println(ps.currentSlices);
	} 
}
