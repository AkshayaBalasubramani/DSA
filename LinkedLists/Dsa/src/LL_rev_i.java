public class LL_rev_i {
    Node head;
    private int size;
    LL_rev_i(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //to preserve the head operator
        //it holds the structure of the ll
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void delFirst(){
        if(head==null){
            System.out.println("ll is empty");
        }
        size--;
        head=head.next;
    }
    public void delLast(){
        if(head==null){
            System.out.println("ll is empty");
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node currNode=head.next;
        Node prevNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            prevNode=prevNode.next;
        }
        prevNode.next=null;
    }
    public int getSize(){
        return size;
    }
    public void print(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void revIterate(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
        LL_rev_i list=new LL_rev_i();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.print();
        list.revIterate();
        list.print();
    }
}
