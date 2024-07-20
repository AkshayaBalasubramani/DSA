package Akshaya;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            size++;
            this.data = data;
            this.next = null;
        }
    }
     void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
     void printList(){
        if(head==null){
            System.out.println("list empty");
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("empty");
        }
        size--;
        head=head.next;
    }
    void deleteLast(){
        if(head==null){
            System.out.println("empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("1");
        list.addFirst("2");
        list.addFirst("3");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();
    }
}
