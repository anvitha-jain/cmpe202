import com.example.lab4;
public interface Component {

     void printDescription() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     Double getPrice();

}
 
