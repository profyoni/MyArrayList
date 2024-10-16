import java.util.*;



public class SinglyLinkedList implements List<String> {

    private static class Node { // private = can be used / accessed only within this Outer Class (SinglyLinkedList)
                                // STATIC inner class = an instance of inner class DOES NOT have access to the outer instance
        String data;
        Node next;

//        void CantAccessOuter()
//        {
//            int x = size();
//        }
    }

    private Node head;
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
        Node currentNode = head;
        while (currentNode != null) {// iterate through nodes until next is null
            if ( (Objects.equals(o, currentNode.data)))// check each node's data if equal to o
                return true;// if equal return true
            currentNode = currentNode.next; // update current Node to next node
        }
        return false;   // if we reached the end of the list (node's next is null) return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
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
        // newing up the Node and inserting data in it
        Node newNode = new Node();
        newNode.data = s;
        newNode.next = null;

        if (head == null) { // first elt
            this.head = newNode;
        }
        else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
        return true;
    }

    // helper method
    private Node getLastNode() {
        Node currentNode = head;
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
    public boolean addAll(Collection<? extends String> c) {
        return false;
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
        return "";
    }

    @Override
    public String set(int index, String element) {
        return "";
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
