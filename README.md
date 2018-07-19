# Data Structures and Algorithms
Implementations of data structures and algorithms

## Languages: 
Java

## Included Data Structure Implementations:
Linked List

## Included Algorithm Implementations: 
Bubble Sort
Insertion Sort
Selection Sort

# Linked List
Implementation of a singly linked list

## Node Class
### Variables:
#### int data
integer value
#### Node next
pointer to the next node

## Variables:
### Node head
pointer to the head of the linked list

## Methods
### add(Node input)
#### Parameters:
Node

#### Description: 
Adds the input node to the linked list.

### print()
#### Description:
Prints the linked list starting from head.

### remove(Node input)
#### Parameters:
Node

#### Description:
Locates and removes the input node from the linked list.

### removeDups()
#### Description:
Will locate all duplicates and remove them. Time complexity is pretty bad at O(n^2).

### main
#### Desciption:
Comment out or delete this method when putting linked list class to use. Main method will print out a given array and remove duplicates and print out array again.

# Bubble Sort
Implemented through the sort method
## Variables:
### boolean swapped
Boolean that checks to see if an element as been swapped during an iteration through the array and is used to return if there hasnt' been a swap which indicates the array has been sorted.

## Methods
### swap(int[] arr, int i, int j)
#### Parameters:
int[], int, int

#### Description:
Takes in the array and two indicies and will swap the elements of the given indices in the given array

### print(int[] arr)
#### Parameters:
Takes an integer array as a parameter.

#### Description:
Prints out all the elements in the given array.

### main
Prints out a given array and then calles the sort method and then prints out the sorted array.

# Insertion Sort
Implemented through the sort method
## Methods
### swap(int[] arr, int i, int j)
#### Parameters:
int[], int, int

#### Description:
Takes in the array and two indicies and will swap the elements of the given indices in the given array

### print(int[] arr)
#### Parameters:
Takes an integer array as a parameter.

#### Description:
Prints out all the elements in the given array.

### main
Prints out a given array and then calles the sort method and then prints out the sorted array.

# Selection Sort
Implemented through the sort method
## Variables:
### int min
Integer variable that will keep track of the index of the smallest element found in the array during an interation

## Methods
### swap(int[] arr, int i, int j)
#### Parameters:
int[], int, int

#### Description:
Takes in the array and two indicies and will swap the elements of the given indices in the given array

### print(int[] arr)
#### Parameters:
Takes an integer array as a parameter.

#### Description:
Prints out all the elements in the given array.

### main
Prints out a given array and then calles the sort method and then prints out the sorted array.