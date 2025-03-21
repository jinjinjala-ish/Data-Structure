package listarray;

public class HasPreviousMain {
    public static void main(String[] args) {
        HasPrevious numbers = new HasPrevious();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers.print());

        numbers.add(1,15);

        numbers.addFirst(5);

        System.out.println(numbers.print());

        numbers.remove(3);
        System.out.println(numbers.print());

        HasPrevious.ListIterator li = numbers.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        while (li.hasNext()) {
            int number = (int)li.next();
            if (number == 30) { //배열 요소의 값이 30이라면 35를 추가
                li.add(35);
            }
        }
        System.out.println(numbers.print()); //5,10,15,30,35,40

        while (li.hasNext()) {
            int number = (int)li.next();
            if (number == 35) {
                li.remove();
            }
        }
        System.out.println(numbers.print());
    }
}
