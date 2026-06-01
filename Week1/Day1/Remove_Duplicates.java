package Week1.Day1;

public class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {

        int key=0;
        int len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[key]){
                nums[key+1]=nums[i];
                key++;
            }
        }
        return key+1;
    }
}
