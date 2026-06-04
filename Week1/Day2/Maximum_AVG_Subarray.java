package Week1.Day2;

public class Maximum_AVG_Subarray {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;

        double max=Integer.MIN_VALUE;
        double sum=0;
        for(int j=0;j<k;j++){
            sum+=nums[j];
        }
        if(sum>max){
            max=sum;
        }
        for(int i=1;i<=n-k;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            if(sum>max){
                max=sum;
            }
        }

        return max/k;
    }
}
