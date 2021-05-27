import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        //loop through a acollection
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
