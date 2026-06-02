package Week1.Day2;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
}
