/*
 Given a singly linked list, delete middle of the linked list.

For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
Return the head of the linked list after removing the middle node.

If the input linked list has 1 node, then this node should be deleted and a null node should be returned.
* */
public class DeleteMiddleLL {

    static Node head;

    public static void insertFirst(int x){


        Node newNode=new Node(x);

        if(head==null){
          head=newNode;
          return;
        }

        newNode.next=head;
        head=newNode;
        return;
    }

    public static void display(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
            count++;
        }
        System.out.println();
        System.out.print("Total Count "+count);
        System.out.println();
    }

    public static void findMiddleAndDelete(){
        Node temp=head;
        Node slow=head;
        Node fast=head;

        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!= null && fast.next.next == null){
            slow=slow.next;
        }

        while(temp.next != slow){
            temp=temp.next;
        }
        temp.next=slow.next;
        slow.next=null;

    }

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};

       for(int i=0;i<arr.length;i++){
           insertFirst(arr[i]);
       }
       display();
       findMiddleAndDelete();
       display();

    }
}
