import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashSet;
import java.util.Iterator;
public class Hash1 {
    public static void main(String[] args) {
        //create a hash set
        HashSet<Integer> set=new HashSet<>();
        //similar to array list
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(8);
        set.add(1);//only unique ones added

        //search
        if(set.contains(1)){
            System.out.println("contains 1");
        }
        if(!set.contains(6)){
            System.out.println("doesnt hav 6");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 deleted");
        }

        //size of set
        System.out.println("size of set="+set.size());

        //all elements of a set
        System.out.println(set);

        //iterator inside a set
        Iterator it=set.iterator();
        //fns
        //hasNext
        //next fn
        //sets are unordered
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
