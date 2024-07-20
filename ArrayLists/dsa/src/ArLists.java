import java.util.*;
public class ArLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(3);

        System.out.println(list);

        //get elements
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        //add elements in between
        list.add(1,7);
        System.out.println(list);

        //change index of the element
        list.set(0,10);
        System.out.println(list);

        //delete element
        list.remove(4);
        System.out.println(list);

        System.out.println(list.size());

        //iteration
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting-optimized sort
        Collections.sort(list);
        System.out.println(list);
    }
}
