import java.util.*;

public class Queue{

    private List<Integer> queue;

    public Queue(){
        queue = new ArrayList<>();
    }

    //Queue rules: First In, First Out
    public void enqueue(int item){
        queue.add(item);
    }

    public int dequeue() throws Exception{
        if(queue.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return queue.remove(0);
    }

    public int peek() throws Exception{
        if(queue.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void print(){
        System.out.println(queue);
    }

    public static void main(String[] args){

        Queue queue = new Queue();

        System.out.println("Adding to queue: 1, 2, 3, 4.");

        for(int i = 1; i <=4; i++){
            queue.enqueue(i);
            try{
                System.out.println("Peeking: " + queue.peek());
            }catch(Exception e){
                System.out.println(e);
            }
        }

        System.out.println("\nDequeuing from queue");
        for(int i = 0; i < 5; i++){
            try{
                System.out.println(queue.dequeue());
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}