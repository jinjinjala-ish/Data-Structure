package listarray;

public class HasPrevious {
    private int size = 0;
    Object[] elementData = new Object[100];

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean add(int index, Object element) {
        for (int i = size; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public Object addFirst(Object element) {
        return add(0, element);
    }

    public String print() {
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

    public boolean remove(int index) {
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator{
        private int nextIndex = 0;

        public boolean hasNext() {
            return size() > nextIndex;
        }

        public Object next() {
            return elementData[nextIndex++];
        }

        public boolean hasPrevious() {
            return nextIndex > 0; //nextIndex >= 0은 안 됨 /--nextIndex이기 때문에 -1이 됨
        }

        public Object previous() {
            return elementData[--nextIndex];
        }

        public void add(Object element) {
            HasPrevious.this.add(nextIndex++,element);
        }

        public void remove() {
            HasPrevious.this.remove(nextIndex-1);
            nextIndex--;
        }
    }
}
