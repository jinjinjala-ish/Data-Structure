package listarray;

public class ToStringArrayMain {
    public static void main(String[] args) {
        ToStringArray tsa = new ToStringArray();

        tsa.addLast(10);
        tsa.addLast(20);
        tsa.addLast(30);
        tsa.addLast(40);

        tsa.add(1,15);

        tsa.addFirst(5); //5,10,15,20,30,40
        tsa.addFirst(3); //3,5,10,15,20,30,40

        System.out.println(tsa);

        /*tsa.remove(1); //3,10,15,20,30,40*/
        System.out.println(tsa.remove(1));
        System.out.println(tsa);

        tsa.removeFirst();
        System.out.println(tsa);
        tsa.removeLast();
        System.out.println(tsa);
    }
}
