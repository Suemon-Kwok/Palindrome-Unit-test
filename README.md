# Palindrome Checker - Data Structures Assignment

A Java implementation of linked list data structures (LinkedList, Queue, Stack) with a palindrome checker application.

## 📋 Project Overview

This project implements fundamental data structures from scratch and uses them to build a palindrome detection system. A palindrome is a word, phrase, number, or sequence that reads the same backward as forward.

## 🏗️ Project Structure

```
Question_1_Unit_test/
├── Node.java              # Generic node class for linked structures
├── LinkedList.java        # Custom linked list implementation
├── Queue.java            # Queue implementation using LinkedList
├── Stack.java            # Stack implementation using LinkedList
├── DataAnalysis.java     # Palindrome checker using Queue and Stack
└── LinkedListTest.java   # Comprehensive unit tests
```

## 🔧 Components

### 1. Node Class (5%)
- Generic node with `data` and `next` pointer
- Implements `equals()` method for data comparison
- Implements `compareTo()` method for ordering
- Supports any Comparable type

### 2. LinkedList Class (20%)
**Features:**
- `add(E data)` - Adds element to end
- `addHead(E data)` - Adds element to head
- `addInOrder(E data)` - Adds element maintaining sorted order
- `contains(Node node)` - Checks if node exists
- `getData(int index)` - Returns data at index
- `getNode(int index)` - Returns node at index
- `remove(Node node)` - Removes specified node
- `remove(int index)` - Removes node at index
- `removeFromHead()` - Removes first node
- `removeFromTail()` - Removes last node
- `printLinkedList()` - Displays list contents

**Special Feature:** All methods implemented recursively (no loops) for +10 bonus marks

### 3. Queue Class (5%)
FIFO (First In, First Out) implementation
- `enqueue(E data)` - Adds element to rear
- `dequeue()` - Removes element from front
- `getSize()` - Returns queue size
- `printQueue()` - Displays queue contents
- `isEmpty()` - Checks if queue is empty

### 4. Stack Class (5%)
LIFO (Last In, First Out) implementation
- `push(E data)` - Adds element to top
- `pop()` - Removes element from top
- `peek()` - Views top element without removing
- `getSize()` - Returns stack size
- `printStack()` - Displays stack contents
- `isEmpty()` - Checks if stack is empty

### 5. DataAnalysis Class (5%)
Palindrome detection using Queue and Stack
- Handles Character arrays
- Ignores single spaces in palindrome phrases
- Detects multiple consecutive spaces (returns false)
- Case-insensitive comparison

**Examples:**
- ✅ "Able was I ere I saw Elba" → `true`
- ❌ "Able was I ere I  saw Elba" (double space) → `false`

## 🧪 Testing

Run `LinkedListTest.java` to execute comprehensive unit tests:

```bash
javac Question_1_Unit_test/*.java
java Question_1_Unit_test.LinkedListTest
```

**Test Coverage (40 marks total):**
- ✅ `test_add()` - 3 marks
- ✅ `test_contains()` - 2 marks
- ✅ `test_getData()` - 3 marks
- ✅ `test_remove()` - 3 marks
- ✅ `test_remove_head()` - 2 marks
- ✅ `test_remove_tail()` - 2 marks
- ✅ `test_Queue()` - 5 marks
- ✅ `test_Stack()` - 5 marks
- ✅ `test_palindrome()` - 5 marks
- ✅ `test_add_in_order()` - 5 marks
- ✅ `test_Node_Class()` - 5 marks

## 💻 Usage Examples

### LinkedList Example
```java
LinkedList<Integer> list = new LinkedList<>();
list.add(10);
list.add(20);
list.addInOrder(15);  // Maintains sorted order
list.printLinkedList(); // Output: 10 -> 15 -> 20
```

### Queue Example
```java
Queue<Character> queue = new Queue<>();
queue.enqueue('H');
queue.enqueue('E');
queue.enqueue('L');
queue.dequeue();  // Returns 'H'
```

### Stack Example
```java
Stack<String> stack = new Stack<>();
stack.push("First");
stack.push("Second");
stack.pop();  // Returns "Second"
```

### Palindrome Checker
```java
Character[] chars = "racecar".toCharArray();
Character[] characters = new Character[chars.length];
for(int i = 0; i < chars.length; i++) {
    characters[i] = chars[i];
}
DataAnalysis<Character> analyzer = new DataAnalysis<>(characters);
boolean result = analyzer.isPalindrome();  // Returns true
```

## ✨ Key Features

- **Generic Implementation**: All structures support any Comparable type
- **Recursive Algorithms**: LinkedList uses recursion throughout (no loops)
- **Comprehensive Error Handling**: Proper exceptions and boundary checks
- **Memory Efficient**: O(1) operations for stack/queue head operations
- **Well-Documented**: Extensive inline comments and JavaDoc

## 🎓 Academic Information

**Course:** Data Structures and Algorithms  
**Assignment:** Assignment 1 - Question 1  
**Weight:** 40% of Assignment 1 (20% of final grade)  
**Student:** Suemon Kwok  


## 📝 Requirements Met

- [x] Node class with equals and compareTo methods
- [x] LinkedList with all required methods
- [x] Recursive implementation (no loops) for bonus marks
- [x] Queue with FIFO behavior
- [x] Stack with LIFO behavior
- [x] Palindrome checker with space handling
- [x] All unit tests passing (40/40 marks)

## 🚀 Running the Project

1. **Compile all files:**
   ```bash
   javac Question_1_Unit_test/*.java
   ```

2. **Run unit tests:**
   ```bash
   java Question_1_Unit_test.LinkedListTest
   ```

3. **Run individual demonstrations:**
   ```bash
   java Question_1_Unit_test.Queue
   java Question_1_Unit_test.Stack
   ```

## 📄 License



## 🤝 Contributing


Question 1) Linked List (40%)
The purpose of this question is to create a linked collection and utilize the collection to build an
application to check whether an input word or phrase is a palindrome. A palindrome is a word,
phrase, number, or sequence of words that reads the same backward as forward.
Node Class (5%)
Create a Node Class which has data and linker parts to store any type of data and nodes can be
linked to each other together by their linkers named “next”.
Node class has a generic object named “data” which references to any type of object (the object
type may be String, Integer, Float or Character).
Node Class has a node object named “next” which references to another node.
Node Class has an “equals” method. “equals” method takes a Node object in and returns true if
content of the argument (node)’s data equals to the content of current node’s data. Otherwise, it
returns false.
Node Class has an “compareTo” method. “compareTo” method takes a Node object in and returns
an int 0 if the argument node’s data equals to current node’s data; an int value less than 0 returns if
current node’s data is numerically less than the argument node’s data or current node’s data is
alphabetically less than the argument node’s data. Otherwise, it returns an int value greater than 0.
LinkedList Class (20%)
Create a LinkedList Class which builds and manages a linked list. Extra 10 marks will be given if no
loops are used in this Class and all methods work correctly.
LinkedList Class has a Node object named “head” to reference to the head of a linked list.
LinkedList Class has an int variable named “size” to store the size of a linked list (number of nodes).
LinkedList Class has an “add” method. It takes a generic object to create a node then adds the node
to the end of a linked list.
LinkedList Class has an “addHead” method. It takes a generic object to create a node and adds to the
head of a linked list.
LinkedList Class has an “addInOrder” method. It takes a generic object to create a node and adds to
a linked list following the ascending numerical order if the generic object is a number. It follows
alphabetical order if the generic object is a char, String.
LinkedList Class has a “contains” method. It takes a node and returns true if the linked list contains
this node. Otherwise, it returns false.
LinkedList Class has a “getData” method. It takes an
index then returns a data of the node which is at that
index.
LinkedList Class has a “getHead” method. It returns the
first node.
LinkedList Class has a “getNode” method. It takes an
index then returns a node which is at that index. (This
can be used in getData() method)
LinkedList Class has a “remove” method. It takes a node
as an argument and removes a node which has the
same data as the argument node from the linked list.
LinkedList Class has a “remove” method. It takes an
index and removes a node which is at that index.
LinkedList Class has a “removeFromHead” method. It
removes the first node from the linked list.
LinkdedList Class has a “removeFromTail” method. It
removes the last node from the linked list.
LinkedList Class has a “printLinkedList”method. It prints
all the contains of the linked list to the console.
Notice: All the private methods are optional. Most of them are for recursion. You may add your own
methods if you wish.
Queue Class (5%)
Queue class manages a linked list as a queue.
Queue class has a “dequeue” method. It dequeues and returns the object from a queue.
Queue class has an “enqueue” method. It takes a generic object and enqueues the object to a
queue.
Queue class has a “getSize” method. It returns number of elements in the queue.
Queue class has a “printQueue” method. It prints the contains of the queue to the console.
Stack Class (5%)
Stack class manager a linked list as a stack.
Stack class has a “getSize” method. It returns number of elements in the stack.
Stack class has an “push” method. It takes a generic object and push the object to a stack.
Stack class has a “pop” method. It pops and returns the node from a stack.
Stack class has a “printStack” method. It prints the contains of the stack to the console.
DataAnalysis Class (5%)
DataAnalysis class checks whether a list of data is palindrome (you may use Queue or Stack Classes).
DataAnalysis class has a “data” which stores a testing String.
DataAnalysis class has a “Queue” or “Stack”(they are optional).
DataAnalysis class has a “isPalindrome” method. It checks testing String and returns true if it is a
palindrome or false if it is not a palindrome.
You can add more fields or methods if you need for part 1.
