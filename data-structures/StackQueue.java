public class StackQueue{

    private Stack s1;
    private Stack s2;

    public StackQueue(){
        s1 = new Stack();
        s2 = new Stack();
    }

    //Queue rules: First In, First Out
    public void enqueue(int item) {
        if(!s1.isEmpty()){
            s1.push(item);
        }else{
            s2.push(item);
        }
    }

    public int pop() throws Exception{
        if(s1.isEmpty() && s2.isEmpty()){
            throw new Exception("Queue is empty!");
        }
        if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
        else{
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return s1.pop();
        }
    }

    public int peek() throws Exception{
        if(s1.isEmpty() && s2.isEmpty()){
            throw new Exception("Stack is empty!");
        }
        if(!s1.isEmpty())
            return s1.peek();
        else
            return s2.peek();
    }

    public void print(){
        if(!s1.isEmpty())
            s1.print();
        else
            s2.print();
    }

    public static void main(String[] args){

        Queue queue = new Queue();

        try{
            System.out.println("\n\nTesting queue stack......");
            for(int i = 1; i <= 5; i++){
                queue.enqueue(i);
                queue.print();
            }

            System.out.println("\nPeeking... " + queue.peek());

            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());

            System.out.println("\nPeeking..." + queue.peek());

            queue.enqueue(6);
            queue.print();
            queue.enqueue(7);
            queue.print();

            System.out.println("\nPeeking..." + queue.peek());

            for(int i = 0; i < 6; i++)
                System.out.println(queue.dequeue());

        }catch(Exception e){
            System.out.println(e);
        }

    }
}