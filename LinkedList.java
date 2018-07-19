
 class Node {
      int data;
      Node next;

      public Node(int input) {
          data = input;
          next = null;
      }
  }

  class LinkedList {

      public Node head;

      public LinkedList() {
          head = null;
      }

      public void add(Node input){
          if(head == null)
              head = input;
          else{
              Node curr = head;
              Node temp = null;
              while(curr != null) {
                  temp = curr;
                  curr = curr.next;
              }
              temp.next = input;
          }
      }

      public void print(){
          Node curr = head;
          System.out.print("{ ");
          do{
              System.out.print(curr.data + " ");
              curr = curr.next;
          }while(curr!=null);
          System.out.println("}");
      }

      public Node remove(Node input){
          Node prev = null;
          Node curr = head;
          while(curr != input){
              prev = curr;
              curr = curr.next;
          }
          //.out.println("")
          prev.next = curr.next;
          //System.out.println("prev: " + prev.data + " curr: " + curr.data);
          return curr;
      }

      public void removeDups() {
          Node stationary = head;
          Node moving = head.next;

          while(stationary.next != null){

              if(moving.next == null){
                  //when the moving pointer reaches the end of the list, the stationary one will iterate
                  //and the moving one will start at the next one
                  stationary = stationary.next;
                  moving = stationary.next;
                  //System.out.println("Stationary: " + stationary.data + " Moving: " + moving.data);
              }else{
                  moving = moving.next;
              }

              if(moving.data == stationary.data){
                  this.remove(moving);
              }
          }
      }

      public static void main(String[] args) {
          LinkedList li = new LinkedList();

          int[] arr = {7, 0, 9, 1, 6, 6, 7};

          for(int i = 0; i < arr.length; i++){
              li.add(new Node(arr[i]));
          }

          System.out.print("Original Array: ");
          li.print();
          li.removeDups();
          System.out.print("Array after removing duplicates: ");
          li.print();
      }
  }