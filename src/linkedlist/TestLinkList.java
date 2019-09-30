package linkedlist;
//test 1
public class TestLinkList {

    public static void main(String args[]){

        LinkedList link1 = new LinkedList();

        link1.add(5);
        link1.add(3);
        link1.add(4);
        link1.add(1);

        link1.deleteWithValue(5);
        link1.deleteWithValue(3);
        link1.deleteWithValue(4);
        link1.deleteWithValue(1);

        link1.printList();

        System.out.println(link1.countList());
    }
}
