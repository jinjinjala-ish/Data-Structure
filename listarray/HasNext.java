package listarray;

public class HasNext {
    private int size;
    Object[] elementData = new Object[100];

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

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private int nextIndex = 0;
        public Object next() {
            /* Object returnData =  elementData[nextIndex];
            nextIndex++;
            return returnData;*/
            return elementData[nextIndex++]; //처음 nextIndex값을 사용 한 후 값 증가
        }

        public boolean hasNext() {
            //nextIndex값이 size()와 비교해서, size()의 값이 더 적으면 next()를 호출해서 값을 가져올 수 있음을 true로 리턴/ 같거나 더 크다면 false
            return nextIndex < size();
        }
    }

}


