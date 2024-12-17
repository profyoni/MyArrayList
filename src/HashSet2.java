import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashSet2<T> implements Set<T> {

    private LinkedList<T> [] hashTable = new LinkedList[10];
    private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private LinkedList<T> getBucket(Object o){
        int hc = o.hashCode();
        int index = Math.abs(hc % hashTable.length);
        LinkedList<T> list = hashTable[index];
        if (list == null) {
            list = new LinkedList<>();
            hashTable[index] = list;
        }
        return list;
    }

    @Override
    public boolean contains(Object o) {
        LinkedList<T> list = getBucket(o);
        return list.contains(o);
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

    @Override
    public boolean add(T t) {
    //    if (loadFactorExceeded()){
    //        growHashTable();
    //    }
        if (contains(t)) {
            return false;
        }
        LinkedList<T> list = getBucket(t);
        list.add(t);
        size++;
        return true;
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
