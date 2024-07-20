import java.util.HashSet;
import java.util.Iterator;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,2,1,1,1,2};
        int a1[]={1,2};
        int check=arr.length/3;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==key){
                    c++;
                }
            }
            if(c>check){
                h.add(arr[i]);
            }
        }
        Iterator it=h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        HashSet<Integer> h1=new HashSet<>();
        //contains duplicate
        for(int i=0;i<a1.length;i++){
            h1.add(arr[i]);
        }
        if(h1.size()<a1.length){
            System.out.println("contains duplicate");
        }
        else{
            System.out.println("doesn't hav duplicates");
        }
    }
}
