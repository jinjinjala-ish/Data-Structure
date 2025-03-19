package listarray;

public class AddMain {
    public static void main(String[] args) {
        AddList addList = new AddList();
        addList.addLast(10);
        addList.addLast(20);
        addList.addLast(30);
        addList.addLast(40); //10,20,30,40
        addList.add(1, 15); //10,15,20,30,40
        addList.addFirst(5); //5,10,15,20,30,40
    }
}
