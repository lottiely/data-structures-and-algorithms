public class QueueStack {

    private Queue q1;
    private Queue q2;
   
    public QueueStack(){
        q1 = new Queue();
        q2 = new Queue();
    }

    /*************************************************
     *  Queue Stack Operations  
     *      Push is the costly operation
     *
     */

    public void push(int item){
        if(q1.isEmpty()){
            //add item to q1
            //transfer everything to q1
            q1.enqueue(item);
            while(!q2.isEmpty()){
                try{
                    q1.enqueue(q2.dequeue());
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }else{
            //add item to q2
            //transfer everything to q2
            q2.enqueue(item);
            while(!q1.isEmpty()){
                try{
                    q2.enqueue(q1.dequeue());
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }

    public int pop() throws Exception{
        if(q1.isEmpty() && q2.isEmpty())
            throw new Exception("Stack is empty!");
        return !q1.isEmpty() ? q1.dequeue() : q2.dequeue();
    }

    public int peek() throws Exception{
        if(q1.isEmpty() && q2.isEmpty()){
            throw new Exception("Stack is empty!");
        }

        return q1.isEmpty() ? q2.peek() : q1.peek();
    }

    public void print(){
        if(!q1.isEmpty()){
            q1.print();
        }else{
            q2.print();
        }
    }

    /*************************************************
     *  Main
     *
     */

    public static void main(String[] args){
        
        QueueStack stack = new QueueStack();

        try{
            System.out.println("\n\nTesting queue stack......");
            for(int i = 1; i <= 5; i++){
                stack.push(i);
                stack.print();
            }

            System.out.println("\nPeeking... " + stack.peek());

            System.out.println(stack.pop());
            System.out.println(stack.pop());

            System.out.println("\nPeeking..." + stack.peek());

            stack.push(6);
            stack.print();
            stack.push(7);
            stack.print();

            System.out.println("\nPeeking..." + stack.peek());

            for(int i = 0; i < 6; i++)
                System.out.println(stack.pop());

        }catch(Exception e){
            System.out.println(e);
        }
    }
}