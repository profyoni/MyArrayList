import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class MyArrayListIteratorIndependent implements Iterator<String> {

    private MyArrayList listThis;
    MyArrayListIteratorIndependent(MyArrayList myArrayListThis) {
        listThis = myArrayListThis;
    }

    private int cursor = 0;
    @Override
    public boolean hasNext() {
        return this.cursor < listThis.size();
    }

    @Override
    public String next() {
        return listThis.get(cursor++);
    }
}

// x = al.size(); x = -100;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyArrayList implements List<String> {

    public MyArrayList(){
        this(10); // telescoping c-tor
    }

    public MyArrayList(int capacity){
        backingStore = new String[capacity];
        insertionPoint = 0;
    }


    private String[] backingStore;
    private int insertionPoint;

    @Override
    public int size() {
        return this.insertionPoint;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyArrayListIterator();
    }

    // (non-static = plain vanilla) inner class
    public class MyArrayListIterator implements Iterator<String> {

        private int cursor = 0;
        @Override
        public boolean hasNext() {
            return this.cursor < MyArrayList.this.size();
        }

        @Override
        public String next() {
            return MyArrayList.this.get(cursor++);
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        if (insertionPoint >= backingStore.length) {
            growBackingStore();
        }
        backingStore[insertionPoint] = s;
        insertionPoint++;
        return true;
    }

    private void growBackingStore() {
        String [] newBackingStore = new String[backingStore.length * 2 + 1];
        System.arraycopy(backingStore, 0, newBackingStore, 0, backingStore.length);
        backingStore = newBackingStore;

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        for (String s : c) {
            this.add(s);
        }
        return true; // sometimes return false
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String get(int index) {
        throwExceptionIfIndexOutBounds(index);
        return backingStore[index];
    }

    private void throwExceptionIfIndexOutBounds(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    @Override
    public String set(int index, String element) {
        throwExceptionIfIndexOutBounds(index);
        String oldValue = backingStore[index];
        backingStore[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, String element) {

    }

    @Override
    public String remove(int index) {
        return "";
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}