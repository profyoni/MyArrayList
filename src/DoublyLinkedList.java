import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class DoublyLinkedList<T> extends AbstractSequentialList<T> {

    public DoublyLinkedList() {
        head.next = tail;
        tail.prev = head;
    }

    private final Node<T> head = new Node<>(null), // dummy head
                          tail = new Node<>(null); // dummy tail
    private int size;

    private static class Node<T> {
        public Node(T data) {
            this.data = data;
        }
        private T data;
        private Node<T> next, prev;
    }

    private class MyListIterator implements ListIterator<T>
    {
        Node<T> cursor = head; // node before index
        MyListIterator(int index){
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, size));
            for (int i = 0;i < index;i++){
                cursor = cursor.next;
            }

        }
        @Override
        public boolean hasNext() {
            return cursor.next != tail;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public T previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {

        }

        @Override
        public void add(T t) {
            Node<T> newNode = new Node<>(t);
            newNode.next = cursor.next;
            cursor.next = newNode;
            newNode.prev = cursor;
            newNode.next.prev = newNode;

            cursor = cursor.next;
            size++;
        }
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new MyListIterator(index);
    }

    @Override
    public int size() {
        return size;
    }
}
