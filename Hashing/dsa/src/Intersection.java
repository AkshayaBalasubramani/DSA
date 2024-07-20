import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,4};
        int a2[]={1,2,5,6,6};
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<a1.length;i++){
            h.add(a1[i]);
        }
        for(int i=0;i<a2.length;i++){
            h1.add(a2[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        Iterator<Integer> it=h.iterator();
        while(it.hasNext()){
            int v=it.next();
            map.put(v,1);
        }
        Iterator<Integer> it1 = h1.iterator();
        while (it1.hasNext()) {
            int value = it1.next();
            if (map.containsKey(value)) {
                map.put(value, 2); // Assuming the requirement is to update the value to 2 if the key already exists.
            } else {
                map.put(value, 1); // Put the key with a value of 1 if it doesn't exist.
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key);
            }
        }
    }
}
