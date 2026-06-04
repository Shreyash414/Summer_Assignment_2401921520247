package Week1.Day3;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int n=nums.length,i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        while(i<n){
            nums[i]=0;
            i++;
        }
    }
}
