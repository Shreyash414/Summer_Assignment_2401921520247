package Week1.Day3;

public class Squares_of_a_Sorted_Array {  public int[] sortedSquares(int[] nums) {
    int len=nums.length;
    int i=0;
    int j=len-1;
    int[] res= new int[len];

    for(int k=0 ; k<len ; k++){
        nums[k]=nums[k]*nums[k];
    }
    len--;
    while(i!=j){
        if(nums[i]>=nums[j]){
            res[len]=nums[i];
            len--;
            i++;
        }
        else if(nums[j]>nums[i]){
            res[len]=nums[j];
            len--;
            j--;
        }
    }
    res[len]=nums[i];
    return res;
}
}
