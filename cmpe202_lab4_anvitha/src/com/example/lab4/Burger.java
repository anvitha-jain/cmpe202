import com.example.lab4;
import java.util.ArrayList;

public class Burger implements IDecorator{

	private ArrayList<String> options;
	private Double price;


	public Burger() {
		options = new ArrayList<>();
		price = 0.0;
	}

	public void printDescription() {

		for(String option : options){
			System.out.println(option);
		}
	}

	public void setOptions(String desc, Double price) {
		options.add(desc);
		this.price += price;
	}

	public Double getPrice() {
		return this.price;
	}
}
