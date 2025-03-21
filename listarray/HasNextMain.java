package listarray;

public class HasNextMain {
    public static void main(String[] args) {
        HasNext numbers = new HasNext();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers.print()); //10,20,30,40

        numbers.add(1,15); //10,15,20,30,40
        System.out.println(numbers.print());

        numbers.addFirst(5); //5,10,15,20,30,40
        System.out.println(numbers.print());

        numbers.remove(1); //5,15,20,30,40
        System.out.println(numbers.print());

        System.out.println(numbers.size());

        System.out.println(numbers.indexOf(70));

        HasNext.ListIterator li = numbers.listIterator();
       /* System.out.println(li.next()); //5
        System.out.println(li.next()); //15
        System.out.println(li.next()); //20
        System.out.println(li.next()); //30
        System.out.println(li.next()); //40
        System.out.println(li.next()); //NULL
*/
        /*while (true) { //오류 발생함. 인덱스 값이 100에 도달하면
            System.out.println(li.next());
        }*/
        while (li.hasNext()) { //hasNext가 true라면 sout 진행, false라면 진행 안 됨
            System.out.println(li.next());
        }
    }
}
