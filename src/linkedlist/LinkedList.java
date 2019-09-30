package linkedlist;

public class LinkedList {
    Node head;


    public void add(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public int countList(){
        Node temp = head;
        int counter = 0;

        while(temp != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public void printList(){
        Node temp = head;

        if(head==null){
            System.out.println("Nothing in the list");
            return;
        }else{
            while(temp !=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void deleteWithValue(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}
