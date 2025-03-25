package linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(30);
        numbers.addFirst(20);
        numbers.addFirst(10);

        numbers.addLst(40);
        numbers.addLst(50);
        numbers.addLst(60);

        System.out.println(numbers.node(0)); //0번째 인덱스를 가진 노드를 반환 //10

        numbers.add(2, 25);

        System.out.println(numbers);

        numbers.removeFirst();
        System.out.println(numbers);

        System.out.println(numbers.remove(0));
        System.out.println(numbers);

        System.out.println(numbers.size());
        System.out.println(numbers.get(3));
    }
}
