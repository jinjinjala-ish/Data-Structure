import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(1,50); //10,50,20,30,40

        numbers.remove(2); //10,50,30,40

        System.out.println(numbers.get(2)); //30
        System.out.println(numbers.size());

    /*    Iterator it = numbers.iterator();
        while (it.hasNext()) {
            int value = (int) it.next();
        }*/
        for (int value : numbers) {
            System.out.println(value);
        }
    }
}
