package Week1.Day2;

import java.util.*;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
