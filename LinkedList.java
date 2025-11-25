package Question_1_Unit_test;

/*
Name: Suemon Kwok
Student ID: 14883335
Data structures and algorithms
*/

public class LinkedList<E extends Comparable<E>> {
    
    // CRITICAL: Must be lowercase to match test expectations
    public Node<E> head;
    public int size;
    
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        head = addRecursive(head, newNode);
        size++;
    }
    
    private Node<E> addRecursive(Node<E> current, Node<E> newNode) {
        if (current == null) {
            return newNode;
        }
        current.next = addRecursive(current.next, newNode);
        return current;
    }
    
    public void addHead(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addInOrder(E data) {
        Node<E> newNode = new Node<>(data);
        head = addInOrderRecursive(head, newNode);
        size++;
    }
    
    private Node<E> addInOrderRecursive(Node<E> current, Node<E> newNode) {
        if (current == null || newNode.data.compareTo(current.data) <= 0) {
            newNode.next = current;
            return newNode;
        }
        current.next = addInOrderRecursive(current.next, newNode);
        return current;
    }
    
    public boolean contains(Node<E> node) {
        return containsRecursive(head, node);
    }
    
    private boolean containsRecursive(Node<E> current, Node<E> target) {
        if (current == null) {
            return false;
        }
        if (current.equals(target)) {
            return true;
        }
        return containsRecursive(current.next, target);
    }
    
    public E getData(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> node = getNodeRecursive(head, index);
        return node.data;
    }
    
    public Node<E> getHead() {
        return head;
    }
    
    public Node<E> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return getNodeRecursive(head, index);
    }
    
    private Node<E> getNodeRecursive(Node<E> current, int remaining) {
        if (remaining == 0) {
            return current;
        }
        return getNodeRecursive(current.next, remaining - 1);
    }
    
    public boolean remove(Node<E> node) {
        int originalSize = size;
        head = removeNodeRecursive(head, node);
        return size < originalSize;
    }
    
    private Node<E> removeNodeRecursive(Node<E> current, Node<E> target) {
        if (current == null) {
            return null;
        }
        if (current.equals(target)) {
            size--;
            return current.next;
        }
        current.next = removeNodeRecursive(current.next, target);
        return current;
    }
    
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        head = removeAtIndexRecursive(head, index);
    }
    
    private Node<E> removeAtIndexRecursive(Node<E> current, int remaining) {
        if (remaining == 0) {
            size--;
            return current.next;
        }
        current.next = removeAtIndexRecursive(current.next, remaining - 1);
        return current;
    }
    
    public void removeFromHead() {
        if (head == null) {
            throw new RuntimeException("Cannot remove from empty list");
        }
        head = head.next;
        size--;
    }
    
    public void removeFromTail() {
        if (head == null) {
            throw new RuntimeException("Cannot remove from empty list");
        }
        head = removeFromTailRecursive(head);
    }
    
    private Node<E> removeFromTailRecursive(Node<E> current) {
        if (current.next == null) {
            size--;
            return null;
        }
        current.next = removeFromTailRecursive(current.next);
        return current;
    }
    
    public void printLinkedList() {
        System.out.print("LinkedList: ");
        printRecursive(head);
        System.out.println(" (Size: " + size + ")");
    }
    
    private void printRecursive(Node<E> current) {
        if (current == null) {
            return;
        }
        System.out.print(current.data);
        if (current.next != null) {
            System.out.print(" -> ");
        }
        printRecursive(current.next);
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}