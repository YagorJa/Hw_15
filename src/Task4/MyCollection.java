package Task4;

public class MyCollection<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] array;
    private int size;

    public MyCollection() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyCollection(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        return (T) array[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = java.util.Arrays.copyOf(array, newCapacity);
        }
    }

    public static void main(String[] args) {
        MyCollection<String> customCollection = new MyCollection<>();

        customCollection.add("Element 1");
        customCollection.add("Element 2");
        customCollection.add("Element 3");

        System.out.println(customCollection.get(1));
        System.out.println(customCollection.contains("Element 4"));

        customCollection.remove(0);
        System.out.println(customCollection.get(0));

        customCollection.clear();
        System.out.println(customCollection.get(0));
    }
}

