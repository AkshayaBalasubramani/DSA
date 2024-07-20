import java.util.*;
public class LL_CollectionFrame {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("i");
        list.addLast("am");
        list.addLast("Rine");
        System.out.println(list);

        list.add("Marie");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");

        //search
        //delete
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);


    }
}
