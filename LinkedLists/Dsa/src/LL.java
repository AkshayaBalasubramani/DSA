import java.util.*;
public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add -first/last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(String data){
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
    public void print(){
        if(head==null){
            System.out.println("empty list");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("empty");
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("empty");
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node secLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is the");
        list.print();
        System.out.println("size="+list.getSize());

        list.addLast("an");
        list.print();

        list.deleteFirst();
        list.print();

        list.deleteLast();
        list.print();

        System.out.println("size="+list.getSize());
    }
}
