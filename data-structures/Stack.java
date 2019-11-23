import java.util.*;

public class Stack {

    private List<Integer> stack;
   
    public Stack(){
        stack = new ArrayList<>();
    }

    //Stack Rule: Last In, First Out
    public void push(int item){
        stack.add(item);
    }

    public int pop() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("Stack is empty!");
        }
        return stack.remove(stack.size()-1);
    }

    public int peek() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("Stack is empty!");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void print(){
        System.out.println(stack);
    }


    /*************************************************
     *  Main
     *
     */

    public static void main(String[] args){
        Stack stack = new Stack();

        try{
            System.out.println("Testing regular stack......");
            System.out.println("Pushing to stack.");
            for(int i = 1; i <= 4; i++){
                stack.push(i);
                System.out.println(stack.peek());

            }
            System.out.println("\nPopping from stack.");
            for(int i = 0; i < 5; i++)
                System.out.println(stack.pop());

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}