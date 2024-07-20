import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int nums[]={3,4,5,6};
        int target=7;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+","+i);
            }
            map.put(num,i);
        }
    }
}
