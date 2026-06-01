package Week1.Day1;
import java.util.*;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sval;
        for(int i=0;i<nums.length;i++){
            sval=target-nums[i];
            if(map.containsKey(sval)){
                return new int[]{i,map.get(sval)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
