/*
* Given a matrix A of size Nx3 representing operations. Your task is to design the linked list based on these
*  operations.

There are four types of operations:


A[i][0] represents the type of operation.
A[i][1], A[i][2] represents the corresponding elements with respect to type of operation.
*/
public class DesignLinkedList {

    static Node head;
    static int count;

    public static void insertBegin(int x) {

        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            count=1;
            return;
        }
        count++;
        newNode.next = head;
        head = newNode;

    }

    public static void insertAtEnd(int x){

        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            count=1;
            return;
        }
        Node curr=head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=newNode;
        count++;
    }

    public static void insertBefore(int x,int index){

        Node newNode=new Node(x);

        Node temp=head;
        int var=2;
        while(temp.next != null && var<index){  //&& temp.next.data != value
            temp=temp.next;
            var++;
        }
       newNode.next=temp.next;
        temp.next=newNode;
        count++;
    }

    public static void insertBeforeIndex(int index,int val){
        if(index<1 || index >count){
            System.out.println("Node will not be inserted");
        } else if(index ==1){
           insertBegin(val);
       }else if(index==count){
            insertAtEnd(val);
        }else {
            insertBefore(val,index);
        }

    }



    public static void deleteAtBegin(){
        if(head == null){
            return;
        }

        if(head.next == null){
            head=null;
            count=0;
            return;
        }

        head = head.next;
        count--;
    }

    public static void deleteAtEnd(){
        if(head == null){
            return;
        }

        if(head.next == null){
            head=null;
            count=0;
            return;
        }
        Node temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        count--;

    }

    public static void deleteAtMiddle(int index){

        /*if(head == null){
            return;
        }
        if(head.next==null){
            head=null;
            count--;
            return;
        }*/

        Node temp=head;
        int var=2;
        while(temp.next != null && var<index ){ //temp.next.data!=x
            temp=temp.next;
            var++;
        }

        temp.next=temp.next.next;
        count--;
    }

    public static void deleteAtIndex(int index){
        if(index<1 || index>count){
            System.out.println("Index not valid");
        }else if(index ==1){
            deleteAtBegin();
        }else if(index==count){
            deleteAtEnd();
        }else{
            deleteAtMiddle(index);
        }

    }

    public static void displayLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Number of total Node "+ count);

    }


    public static void main(String[] args) {
       // int[][] mat={{0, 1, -1},{1, 2, -1},{2, 3, 1},{0, 4, -1},{3, 1, -1},{3, 2, -1}};
        /*
        *
        0 x -1: Add a node of value x before the first element of the linked list. After the insertion,
        the new node will be the first node of the linked list.
        1 x -1: Append a node of value x to the last element of the linked list.
        2 x index: Add a node of value x before the index th node in the linked list.
           If index equals to the length of linked list,the node will be appended
           to the end of linked list. If index is greater than the length,
           the node will not be inserted.
        3 index -1: Delete the index th node in the linked list, if the index is valid.*/
        int[][] mat={{0, 1, -1},{0, 4, -1},{0, 5, -1},{0, 7, -1},
                     {1, 2, -1},{1, 3, -1},
                     {2, 8, 0} ,
                     {3, 8, -1}};


        int n=mat.length;

        for(int i=0;i<n;i++){
                if(mat[i][0]==0){
                    insertBegin(mat[i][1]);
                }else if(mat[i][0]==1){
                    insertAtEnd(mat[i][1]);
                }else if(mat[i][0]==2){
                    insertBeforeIndex(mat[i][1],mat[i][2]);
                }else if(mat[i][0]==3){
                    deleteAtIndex(mat[i][1]);
                }
        }

        displayLinkedList();


    }
}
