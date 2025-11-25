package Question_1_Unit_test;

/*
Name: Suemon Kwok
Student ID: 14883335
Data structures and algorithms
*/

public class DataAnalysis<E extends Comparable<E>> {
    
    private Queue<E> queue;
    private Stack<E> stack;
    private E[] data;
    
    public DataAnalysis(E[] data) {
        this.data = data;
        this.queue = new Queue<>();
        this.stack = new Stack<>();
    }
    
    public boolean isPalindrome() {
        if (data == null || data.length == 0) {
            return true;
        }
        
        if (data.length == 1) {
            return true;
        }
        
        // Check if working with Characters - need special space handling
        if (data[0] instanceof Character) {
            return isPalindromeCharacter();
        }
        
        // For non-Character types, use standard comparison
        Queue<E> tempQueue = new Queue<>();
        Stack<E> tempStack = new Stack<>();
        
        for (E element : data) {
            tempQueue.enqueue(element);
            tempStack.push(element);
        }
        
        while (!tempQueue.isEmpty() && !tempStack.isEmpty()) {
            E queueElement = tempQueue.dequeue();
            E stackElement = tempStack.pop();
            
            if (queueElement.compareTo(stackElement) != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isPalindromeCharacter() {
        // Convert Character array to string
        StringBuilder sb = new StringBuilder();
        for (E element : data) {
            if (element instanceof Character) {
                sb.append((Character) element);
            }
        }
        String str = sb.toString().toLowerCase();
        
        // CRITICAL: Check for multiple consecutive spaces
        // If double space exists, return FALSE immediately (not a palindrome)
        if (str.contains("  ")) {
            return false;
        }
        
        // Remove single spaces only (normal palindrome processing)
        String cleaned = str.replaceAll(" ", "");
        
        if (cleaned.length() <= 1) {
            return true;
        }
        
        // Use Queue and Stack to compare
        Queue<Character> tempQueue = new Queue<>();
        Stack<Character> tempStack = new Stack<>();
        
        for (int i = 0; i < cleaned.length(); i++) {
            char c = cleaned.charAt(i);
            tempQueue.enqueue(c);
            tempStack.push(c);
        }
        
        while (!tempQueue.isEmpty() && !tempStack.isEmpty()) {
            Character queueChar = tempQueue.dequeue();
            Character stackChar = tempStack.pop();
            
            if (queueChar.compareTo(stackChar) != 0) {
                return false;
            }
        }
        
        return true;
    }
}