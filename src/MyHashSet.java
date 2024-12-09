import java.util.*;

public class MyHashSet<T> implements Set<T> {
    private int size;
    private LinkedList<T>[] hashTable = new LinkedList[10];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        LinkedList<T> list = getBucket(o);
        return list != null && list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    final double LOAD_FACTOR = 0.75;
    private boolean reachedLoadFactor()
    {
        return ((double) size) / hashTable.length >= LOAD_FACTOR;
    }

    private void growHashTable(){
        LinkedList<T>[] oldHashTable = hashTable;
        hashTable = new LinkedList[hashTable.length * 2 + 1];

        for (LinkedList<T> list : oldHashTable){
            if (list == null) continue;
            for (T t : list){
                add(t);
            }
        }
        size /= 2; // add increments size, so size is artificially double
    }

    @Override
    public boolean add(T t) {
        if (contains(t))
            return false;
        if (reachedLoadFactor())
        {
            growHashTable();
        }
        LinkedList<T> list = getBucket(t);
        if (list == null) {
            list = new LinkedList<>();
        }

        list.add(t);
        size++;
        return true;

    }

    private LinkedList<T> getBucket(Object o){
        int hc = o.hashCode();
        int index = hc % hashTable.length;
        return hashTable[index];  // bucket
    }
    @Override
    public boolean remove(Object o) {
        LinkedList<T> list = getBucket(o);
        if (list == null)
            return false;
        if (list.remove(o)){
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
