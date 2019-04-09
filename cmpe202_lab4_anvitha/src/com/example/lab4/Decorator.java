import com.example.lab4;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class Decorator implements IDecorator{

    private IDecorator component;

    public Decorator(IDecorator c) {
       component = c;
    }

    public Double getPrice() {
       return component.getPrice();
    }

    public void printDescription() {

        component.printDescription();
    }
}
