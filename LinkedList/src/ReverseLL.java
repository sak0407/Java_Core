/*
* You are given a singly linked list having head node A. You have to reverse the linked list and return the head node
*  of that reversed list.

NOTE: You have to do it in-place and in one-pass.
 A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * 5 -> 4 -> 3 -> 2 -> 1 -> NULL
*
* */
public class ReverseLL {

    public static Node head;

    public static void insertFirst(int x){

        Node newNode=new Node(x);
        if(head == null){
           head=newNode;
           return;
        }

        newNode.next=head;
        head=newNode;
    }
    public static void Display(){
        Node temp=head;
        while(temp!= null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println();
    }


    public static void reverseLL(){

        Node prev=null;
        Node curr=head;

        while(curr != null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }

    public static void main(String[] args) {
        int[] ll={1,2,3,4,5,6,7};

        for (int i=ll.length-1;i>=0;i--){
            insertFirst(ll[i]);
        }
        Display();
        reverseLL();
        Display();

    }
}
