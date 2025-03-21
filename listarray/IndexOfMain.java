package listarray;

public class IndexOfMain {
    public static void main(String[] args) {
        IndexOf numbers = new IndexOf();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers.print());

        numbers.add(1,15);
        System.out.println(numbers.print());

        numbers.addFirst(5);
        System.out.println(numbers.print());

        numbers.remove(1);
        System.out.println(numbers.print());

        System.out.println(numbers.size());

        System.out.println(numbers.indexOf(70));

        //Iterator next, hasNext

    }
}
