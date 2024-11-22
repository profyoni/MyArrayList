import java.util.*;



public class SinglyLinkedList<T> implements List<T> {

    private static class Node<T> { // private = can be used / accessed only within this Outer Class (SinglyLinkedList)
                                // STATIC inner class = an instance of inner class DOES NOT have access to the outer instance
        T data;
        Node<T> next, prev;
    }

    private Node<T> head = new Node<>(), tail; // dummy node
    private int size;

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
        Node currentNode = head.next;
        while (currentNode != null) {// iterate through nodes until next is null
            if ( (Objects.equals(o, currentNode.data)))// check each node's data if equal to o
                return true;// if equal return true
            currentNode = currentNode.next; // update current Node to next node
        }
        return false;   // if we reached the end of the list (node's next is null) return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLLIterator();
    }

    private class MyLLIterator implements Iterator<T> {

        private Node<T> current = head;
        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public T next() {
            if ( ! hasNext()) // oh oh nothing left
                throw new NoSuchElementException();
            current = current.next;
            return current.data;
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
    public boolean add(T s) {
        // newing up the Node and inserting data in it
        Node<T> newNode = new Node<T>();
        newNode.data = s;
        newNode.next = null;

        if (head == null) { // first elt
            this.head = newNode;
        }
        else{
            Node<T> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
        return true;
    }

    // helper method
    private Node<T> getLastNode() {
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
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
    public boolean addAll(int index, Collection<? extends T> c) {
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
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        Node<T> currentNode = head;
        int indexCounter = -1;

        // find node with index - 1
        while (indexCounter != index - 1) {
            indexCounter++;
            currentNode = currentNode.next;
        }
        T data = currentNode.next.data;
        currentNode.next = currentNode.next.next;
        size--;
        return data;
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
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
