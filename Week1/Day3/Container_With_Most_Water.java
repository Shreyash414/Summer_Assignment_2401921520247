package Week1.Day3;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int len = height.length;
        int i = 0;
        int j = len-1;
        int max = 0;
        while(i < j){
            int h = Math.min(height[i],height[j]);
            int b = j-i;
            int area=h*b;
            if(area>max){
                max=area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
