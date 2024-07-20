import java.util.*;

public class Intersection2 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int a1[]={1,2,3,4,5,6};
        int a2[]={1,2,8,10};
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<a1.length;i++){
            h1.add(a1[i]);
        }
        for(int i=0;i<a2.length;i++){
            if(h1.contains(a2[i])){
                a.add(a2[i]);
                h1.remove(a2[i]);
            }
        }
        Integer[] arr = new Integer[a.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < a.size(); i++)
            arr[i] = a.get(i);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
