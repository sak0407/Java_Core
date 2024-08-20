/*
* Reverse a linked list A from position B to C.
NOTE: Do it in-place and in one-pass.
*
 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 2
 C = 4
 Ans-> 1 -> 4 -> 3 -> 2 -> 5
* *
 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 1
 C = 5
 Ans-> 5 -> 4 -> 3 -> 2 -> 1

 In the first example, we want to reverse the highlighted part of the given linked list : 1 -> 2 -> 3 -> 4 -> 5
 Thus, the output is 1 -> 4 -> 3 -> 2 -> 5
*
* */
public class ReversePositionLL {

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





    public static void reverseLLInPosition(int start,int end){
        if(head==null) return;
        if(head.next==null) return;

        Node temp=head;
        Node st=null;
        Node curr=null;

        int count=start;

        while(count>2 && temp.next!=null){
            count--;
            temp=temp.next;
        }
        Node prev=null;

        if(start == 1){
            st=temp;
            curr=temp;
        }else{
            st= temp.next;
            curr=temp.next;
        }


        int nodeCount=end-start+1;

        while(nodeCount>0 && curr !=null){
            Node t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
            nodeCount--;
        }


        st.next=curr;

        if(start==1){
            temp=prev;
            head=temp;
        }else{
            temp.next=prev;
        }




    }

    public static void main(String[] args) {

        int[] ll={1,2,3,4};

        for (int i=ll.length-1;i>=0;i--){
            insertFirst(ll[i]);
        }
        Display();
        reverseLLInPosition(1,4);
        Display();

    }
}
