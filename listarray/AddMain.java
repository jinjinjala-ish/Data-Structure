package listarray;

public class AddMain {
    public static void main(String[] args) {
        AddList addList = new AddList();
        addList.addLast(10);
        addList.addLast(20);
        addList.addLast(30);
        addList.addLast(40);
        addList.add(1, 15);
        addList.addFirst(5);
    }
}
