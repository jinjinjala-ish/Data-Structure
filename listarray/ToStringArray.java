package listarray;

public class ToStringArray {
    int size = 0;
    Object[] elementData = new Object[100];

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true; //배열의 크기가 정해져있어서 boolean 사용함
    }

    public boolean add(int index, Object element) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element) {
        return add(0, element);
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            if (size - i == 1) {
                str += elementData[i];
            } else {
                str += elementData[i];
                str += ", ";
            }
        }
        return str + "]";
    }

    public Object remove(int index) {
        Object removed = elementData[index];
        Object tmp = 0;
        for (int i = index + 1; i < size; i++) {
            tmp = elementData[i];
            elementData[i - 1] = tmp;
            elementData[i] = elementData[i + 1];
        }
        size--;
        return removed; // arraylist는 삭제하려는 요소의 값을 저장하도록 되어있음
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size); 
    }
}
