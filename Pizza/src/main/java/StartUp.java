import domain.Pizza;
import io.PizzaInputReader;

public class StartUp {
	public static void main(String args[]) {
		Pizza p = PizzaInputReader.readPizzaFile("resources/a_example.in");
		System.out.println(p);
		
	}
}
