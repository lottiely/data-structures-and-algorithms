import java.util.*;

public class Heap {

    private List<Integer> heap = new ArrayList<>();

    public void insert(int node){
        //insert node at the bottom of the heap and bubble up
        heap.add(node);
        bubbleUp();
    }

    public int extractMin() throws Exception {
        if(heap.isEmpty()){
            throw new Exception("No Integers in heap.");
        }
        // swap head with last element
        Collections.swap(heap, 0, heap.size()-1);

        //remove last element and bubble down
        int output = heap.remove(heap.size()-1);
        bubbleDown();

        return output;
    }

    public void bubbleUp(){
        //starting at the last element in the heap
        //compare to the parent and swap if it's of smaller value
        int currentIndex = heap.size() -1;
        int parentIndex;

        while(currentIndex != 0){
            //compare to parent 
            //if the current index is the root, it should kick out of loop
            // How I keep thinking... :<
            // if(heap.get(currentIndex) < heap.get(getParent(currentIndex))) 
            //          do my stuff;
            // else
            //          break;
            //

            parentIndex = getParent(currentIndex);
            if(heap.get(currentIndex) > heap.get(parentIndex)) break;
            Collections.swap(heap, currentIndex, parentIndex);
            currentIndex = parentIndex;
        }
    }

    public void bubbleDown(){
        int currentIndex = 0; //root
        int compareIndex;
        int leftChild;
        int rightChild;
        
        //don't do anything if there are no elements or 1 element in the heap
        if(heap.size() > 1){

            //while current index isn't the last element
            while(currentIndex < heap.size()){

                leftChild = 2*currentIndex + 1;
                rightChild = 2*currentIndex + 2;

                if(leftChild >= heap.size() && rightChild >= heap.size()) break; //no children

                //if the current index has both children, pick the smaller one of the two to compare
                if(leftChild < heap.size() && rightChild < heap.size()) {
                    compareIndex = heap.get(leftChild) < heap.get(rightChild) ?
                        leftChild :
                        rightChild;
                }
                else if(leftChild < heap.size()) //it only has a left child
                    compareIndex = leftChild;
                else //only has a right child
                    compareIndex = rightChild;

                //compare
                if(heap.get(currentIndex) < heap.get(compareIndex)) break; //no swap was made
                Collections.swap(heap, currentIndex, compareIndex);
                currentIndex = compareIndex;

                //System.out.println(heap);
            }
        }
    }

    public int getParent(int index){
        //if getParent returns -1, then it is the root node
        if(index == 0)
            return -1;

        // courtesy of Eric because I always forget to use ternary operators
        int res = (index%2 == 0) ?  index-2 : index -1; 
        //even index means right child 
        //odd index means left child
        return res/2;
    }

    public void print(){
        //print heap so I can debug or prove that it's working...
        System.out.println(heap);
    }
    
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(4);
        heap.insert(19);
        heap.insert(1);
        heap.insert(8);
        heap.insert(30);
        heap.insert(72);
        heap.insert(0);
        heap.insert(-1);

        heap.print();
        
        try{
            System.out.println(heap.extractMin()); // -1
            System.out.println(heap.extractMin()); // 0
            System.out.println(heap.extractMin()); // 1
            System.out.println(heap.extractMin()); // 4
            System.out.println(heap.extractMin()); // 8
            System.out.println(heap.extractMin()); // 19
            System.out.println(heap.extractMin()); // 30
            System.out.println(heap.extractMin()); // 72
            heap.extractMin(); // Error Message
        }catch(Exception e){
            System.out.println(e);
        }
    }
}