import java.util.*;
public class HashMapI {
    public static void main(String[] args) {
        //similar to implementation of a hash
        //country (key),population(value)
        HashMap<String,Integer> map=new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("Us",20);
        map.put("china",150);

        System.out.println(map);

        map.put("china",180);
        System.out.println(map);

        //search
        if(map.containsKey("uk")){
            System.out.println("present in map");
        }
        else{
            System.out.println("not present");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("uk"));

//        int arr[]={12,23,45};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for(int val:arr){
//            System.out.print(val+" ");
//        }
//        System.out.println();

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }


        //remove a pair
        map.remove("china");
        System.out.println(map);
    }
}
