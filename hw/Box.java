import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> fruits = new ArrayList<T>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        int fruitsWeight = 0;
        for (T fruit : fruits) {
            fruitsWeight += fruit.getWeight();
        }
        return fruitsWeight;
    }

    public void moveTo(Box<? super T> anotherBox) {
        for (T fruit : fruits) {
            anotherBox.add(fruit);
        }
        fruits = new ArrayList<T>();
    }

}
