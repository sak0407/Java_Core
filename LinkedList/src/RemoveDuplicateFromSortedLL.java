/* Given a sorted linked list, delete all duplicates such that each element appears only once.
*
 1->1->2
Ans:  1->2
*
 1->1->2->3->3
Ans: 1->2->3
.*/

public class RemoveDuplicateFromSortedLL {

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


    public static void removeDuplicateFromLL(){
        Node temp=head;

        while(temp.next != null ){
            if(temp.data==temp.next.data){
                if(temp.next!=null){
                    temp.next=temp.next.next;
                }

            }else{
                temp=temp.next;
            }

        }

    }

    public static void main(String[] args) {
        int[] ll={1};

        for (int i=ll.length-1;i>=0;i--){
            insertFirst(ll[i]);
        }
        Display();
        removeDuplicateFromLL();
        Display();

    }
}
