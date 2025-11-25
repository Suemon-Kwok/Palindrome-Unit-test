package Question_1_Unit_test;

/*
Name: Suemon Kwok
Student ID: 14883335
Data structures and algorithms
*/

public class Node<E extends Comparable<E>> {
    
    public E data;
    public Node<E> next;
    
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
    
    public Node() {
        this.data = null;
        this.next = null;
    }
    
    public boolean equals(Node<E> node) {
        if (node == null) {
            return this.data == null;
        }
        
        if (this.data == null) {
            return node.data == null;
        }
        
        return this.data.equals(node.data);
    }
    
    public int compareTo(Node<E> node) {
        if (node == null || node.data == null) {
            return (this.data == null) ? 0 : 1;
        }
        
        if (this.data == null) {
            return -1;
        }
        
        return this.data.compareTo(node.data);
    }
    
    @Override
    public String toString() {
        return data != null ? data.toString() : "null";
    }
}