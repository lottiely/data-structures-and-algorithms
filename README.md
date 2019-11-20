# Data Structures and Algorithms
Implementations of data structures and algorithms

## Languages: 
Java, Javascript

## Included Data Structure Implementations:
- [LinkedList](#LinkedList) (Java, Javascript)
- [Heap](#Heap) (Java)

## Included Algorithm Implementations: 
- [BubbleSort](#BubbleSort) (Java)
- [InsertionSort](#InsertionSort) (Java)
- [SelectionSort](#SelectionSort) (Java)

# LinkedList
Implementation of a singly linked list

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
# Heap
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

# BubbleSort
Implemented through the sort method
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

# InsertionSort
Implemented through the sort method

## Methods
`void swap(int[] arr, int i, int j)`
Takes in the array and two indicies and will swap the elements of the given indices in the given array

`void print(int[] arr)`
Prints out all the elements in the given array.

`void main`
Prints out a given array and then calles the sort method and then prints out the sorted array.

---

# SelectionSort
Implemented through the sort method
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
