public class LL {
   public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
   }
   public static class link{
    Node head = null;
    Node tail = null;
    int size = 0;
    // insert the node in end of the list
    void insertAtend(int val){
        Node newnode = new Node(val);
        if(head ==null){
            head = newnode;
        }
        else {
            tail.next = newnode ;

        }
        tail = newnode;
        size++;

    }
    // insert at begining of the list
    void insertAtbeg(int val){
        Node newnode = new Node(val);
        if(head ==null){
            head = tail= newnode;
        }
        else{
            newnode.next = head;
            head = newnode;

        }
        size++;
    }
    // insert the element in any position of list 
    void insertAt(int val,int idx){
        Node newnode = new Node(val);
        Node temp = head;
        if(idx==0){
            insertAtbeg(val);
            return;
        }
        if(idx==size){
            insertAtend(val);
            return;
        }
        if(idx<0||idx>size){
            System.out.println("Index is not valid!!..");
            return;
        }
        
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;

    }
    // get the element in the list in any index
    int getAt(int idx){
        Node newnode = head;
        for(int i=0;i<idx;i++){
            newnode = newnode.next;

        }
        return newnode.data;
    }
    // display the list 
    void display(Node head){
        Node newnode = head;
        while(newnode!=null){
            System.out.print(newnode.data+" ");
            newnode = newnode.next;
        }
    }
    void delete(int idx){
        Node newnode = head;
        for(int i =0;i<idx-1;i++){
            newnode= newnode.next;

        }
        newnode.next = newnode.next.next;
        tail = newnode;



    }
   }
public static void main(String args[]){
    link list = new link();
    list.insertAtend(3);
    list.insertAtend(4);
    list.display(list.head);
    list.insertAtbeg(2);
    list.insertAtbeg(1);
    System.out.println();
    list.display(list.head);;
    list.insertAt(5,3);
    System.out.println();
    list.display(list.head);
    System.out.println();
    list.insertAt(11, 0);
    list.display(list.head); //11 1 2 3 5 4
    System.out.println();
    list.insertAt(6,6);
    list.display(list.head);
    System.out.println();
    System.out.println(list.getAt(2));
    System.out.println();
    list.insertAt(9,9);
    list.display(list.head);
    list.delete(0);
    System.out.println();
    list.display(list.head);

        


   

}
}