import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        int a[]={1,2,3};
        int a1[]={1,2,3,4,5,6,7};
        for(int i=0;i<a.length;i++){
            h.add(a[i]);
        }
        for(int i=0;i<a1.length;i++){
            h.add(a1[i]);
        }
        System.out.println(h);
        System.out.println(h.size());
    }
}
