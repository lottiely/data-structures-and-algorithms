# Data Structures and Algorithms
Implementations of data structures and algorithms

## Languages: 
Java, Javascript

## Data Structure Implementations:
- [LinkedList](#LinkedList) (Java, Javascript)
- [Heap](#Heap) (Java)
- [Stack](#Stack) (Java)
- [Queue](#Queue) (Java)

## Algorithm Implementations: 
- [BubbleSort](#BubbleSort) (Java)
- [InsertionSort](#InsertionSort) (Java)
- [SelectionSort](#SelectionSort) (Java)

## Interview Questions
- None right now...

# LinkedList

Implementation of a singly linked list

- [Java](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/LinkedList.java)
- [Javascript](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/linked-list.js)

## Node Sub Class
Variables: 
- `int data`
value
-  `Node next`
pointer to the next node


## Class Variables
- `Node head` pointer to the head of the linked list

## Methods
`void add(Node input)` Adds the input node to the linked list.

`void print()` Prints the linked list starting from head.

`Node remove(Node input)` Locates and removes the input node from the linked list.

`void removeDups()` Will locate all duplicates and remove them. Time complexity is pretty bad at O(n^2).
Not in the Javascript version.

`void main` Comment out or delete this method when putting linked list class to use. Main method will print out a given array and remove duplicates and print out array again.

---
# [Heap](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/Heap.java)
Implementation of a min-heap

## Class Variables
- `List<Integer> heap` An ArrayList storing the min-heap datastructure

## Methods
`void insert(int node)` Inserts node at the bottom of the heap and bubbles up

`int extractMin()` Returns the minimum element in the min-heap

`void bubbleUp()` Starting at the last element in the heap, bubble up the element until it is no longer smaller than its parent

`void bubbleDown()` Starting at the root element, bubble down until it is no longer larger than its children

`int getParent` Calculates the current index parent index and returns the parent index

`void print` Prints the heap to console.

---

# [BubbleSort](https://github.com/lottiely/data-structures-and-algorithms/blob/master/algorithms/BubbleSort.java)
Implementation of Bubble Sort
## Class Variables:
`boolean swapped`
Boolean that checks to see if an element as been swapped during an iteration through the array and is used to return if there hasnt' been a swap which indicates the array has been sorted.

## Methods
`void swap(int[] arr, int i, int j)`
Takes in the array and two indicies and will swap the elements of the given indices in the given array

`void print(int[] arr)`
Prints out all the elements in the given array.

`void main`
Prints out a given array and then calls the sort method and then prints out the sorted array.

---

# [InsertionSort](https://github.com/lottiely/data-structures-and-algorithms/blob/master/algorithms/InsertionSort.java)
Implementation of Insertion Sort

## Methods
`void swap(int[] arr, int i, int j)`
Takes in the array and two indicies and will swap the elements of the given indices in the given array

`void print(int[] arr)`
Prints out all the elements in the given array.

`void main`
Prints out a given array and then calles the sort method and then prints out the sorted array.

---

# [SelectionSort](https://github.com/lottiely/data-structures-and-algorithms/blob/master/algorithms/SelectionSort.java)
Implementation of Selection Sort
## Class Variables:
`int min`
Integer variable that will keep track of the index of the smallest element found in the array during an interation

## Methods
`void swap(int[] arr, int i, int j)`
Takes in the array and two indicies and will swap the elements of the given indices in the given array

`void print(int[] arr)`
Prints out all the elements in the given array.

`void main`
Prints out a given array and then calles the sort method and then prints out the sorted array.

# Stack
Implementation of a Stack. There exists a regular stack implementation and a stack implmentation with two queues.

In the Queue Stack implementation, push is the costly operation.

- [Regular Stack](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/Stack.java)
- [Queue Stack](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/QueueStack.java)

## Dependencies:
[QueueStack.java](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/QueueStack.java) needs to have [Queue.java](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/Queue.java) in this folder because it for the 2 queues in this demonstration.

## Class Variables:
`List<Integer> stack`
Regular Stack implmentation variable only. Private ArrayList that stores the integer values pushed into the stack.

`Queue q1` Queue Stack implementation variable only. Private queue variable that stores the interger value pushed into the stack.

`Queue q2` Queue Stack implementation variable only. Private queue variable that stores the interger value pushed into the stack.

## Methods
`void push(int item)`
Adds item into the stack ArrayList. 

In the Queue Stack implementation, it will enqueue item into the empty queue, and then transfer all the items in the non-empty to the empty queue.

`int pop()`
Removes the last item in the stack ArrayList and returns the value. Will throw an exception if there is nothing in the stack. 

In the Queue Stack implementation, it will dequeue the item from the non-empty queue.

`int peek()`
Retrieves the last item in the stack ArrayList and returns the value. Will throw an exception if there is nothing in the stack. 

In the Queue Stack implementation, it will peek from the non-empty queue.

`boolean isEmpty()`
Checks to see if the stack is empty and then returns true if it is empty and false if it is not. 

In the Queue Stack implementation, it will return false if both queues are empty and true if one of the queues is not empty.

`void print(int[] arr)`
Prints out all the elements in the stack ArrayList.

In the Queue Stack implementation, it will print the non-empty queue.

`void main` Pushes numbers 1 - 4 into the stack, and then tries to pop 5 items from the stack. Will trigger the exception when the stack is empty.

In the Queue Stack implementation, it pushes numbers 1 - 5 into the stack, and then pops from the stack 2 items from the stack (which will be 4 and 5). Pushes 6 and 7 into the stack. Will try to pop 5 items in the stack. Will trigger the exception when the stack is empty.


# Queue
Implementation of a Queue. There exists a regular queue implementation and a queue implmentation with two stacks.

In the Stack Queue implmentation, the pop operation is the costly one.

- [Regular Queue](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/Queue.java)
- [Stack Queue](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/StackQueue.java)

## Dependencies:
[StackQueue.java](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/StackQueue.java) needs to have [Stack.java](https://github.com/lottiely/data-structures-and-algorithms/blob/master/data-structures/Stack.java) in this folder because it for the 2 Stacks in this demonstration.

## Class Variables:
`List<Integer> queue`
Regular Queue implmentation variable only. Private ArrayList that stores the integer values enqueued into the queue.

## Methods
`void enqueue(int item)`
Adds item into the queue ArrayList.

In the Stack Queue implementation, item is added to the non-empty stack.

`int pop()`
Removes the last item in the queue ArrayList and returns the value. Will throw an exception if there is nothing in the queue.

In the Stack Queue implementation, the items in the non-empty stack is transferred into the empty stack. Once transferred, the last item is popped and returned from the new non-empty stack.

`int peek()`
Retrieves the last item in the stack ArrayList and returns the value. Will throw an exception if there is nothing in the stack.

In the Stack Queue implementation, it will peek from the non-empty stack.

`void print(int[] arr)`
Prints out all the elements in the stack ArrayList.

In the Stack Queue implementation, it will print from the non-empty stack.

`void main` Pushes numbers 1 - 4 into the stack, and then tries to pop 5 items from the stack. Will trigger the exception when the stack is empty.

In the Stack Queue implementation, pushes numbers 1 - 5 into the stack, and then pops from the stack 2 items from the stack (which will be 4 and 5). Pushes 6 and 7 into the stack. Will try to pop 5 items in the stack. Will trigger the exception when the stack is empty.