class Node {
    constructor(value){
        this.next = null;
        this.value = value;    
    }
}

class LinkedList {
    constructor(){
        this.head = null;
    }

    add(value) {
        if(this.head == null){
            this.head = new Node(value);
        }
        else{
            let current = this.head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    remove(nthnode) {
        //find node
        if(this.head == null){
            return;
        }
        else{
            let current = this.head;
            let prev = this.head;
            for(let i = 0; i < nthnode; i++){
                if(current.next == null)
                    return;
                else{
                    prev = current;
                    current = current.next;
                }
            }
            prev.next = current.next;
        }
        console.log("Removed the node at index " + nthnode + ".");
    }

    find(valueToFind){
        if(this.head == null)
            return null;
        let current = this.head;
        while(current!=null){
            if(current.value == valueToFind)
                return current;
            current = current.next;
        }
        return null; //exited for loop and never found value in linked list
    }

    print() {
        if(this.head == null)
            return null;
        else{
            let current = this.head;
            while(current!=null){
                console.log(current.value);
                current = current.next;
            }
        }
    }
}

function test() {
    const list = new LinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.print();
    list.remove(1); //not to be confused with value 1, but the 1th node in the list
    list.print();
    console.log(list.find(3))
    console.log(list.find(2))
}

test();
