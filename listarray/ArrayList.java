package listarray;

public class ArrayList {
    private int size = 0; //몇개의 데이터가 배열에 들어있는지
    private Object[] elementData = new Object[100]; //배열의 크기

    public boolean addLast(Object element){
        elementData[size] = element;
        size++;
        return true;
    }
}

