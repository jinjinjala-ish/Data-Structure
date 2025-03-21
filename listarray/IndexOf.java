package listarray;

public class IndexOf {
    private int size = 0;
    Object[] elementData = new Object[100];

    //배열에 추가
    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    //배열에 추가
    public boolean add(int index, Object element) {
        for (int i = size; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    //배열에 추가
    public Object addFirst(Object element) {
        return add(0, element);
    }

    public String print() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            if (size - i != 1) {
                str += elementData[i];
                str += ", ";
            } else {
                str += elementData[i];
            }
        }
        return str + "]";
    }

    //배열에서 삭제
    public boolean remove(int index) {
        for (int i = index; i <size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return true;
    }

    //배열에서 삭제
    public Object removeFirst() {
        return remove(0);
    }

    //배열에서 삭제
    public Object removeLast() {
        return remove(size);
    }

    public int size() {
        return size;
    }

    //해당 값의 인덱스 찾기
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }


}
