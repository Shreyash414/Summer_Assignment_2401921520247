package Week3.Day4;

import java.util.*;

public class Largest_Rectangle_in_Histogram {
    public int largestRectangleArea(int[] heights) {
        int len=heights.length;

        //Left smaller element

        Stack<Integer> ls=new Stack<>();
        int[] lsa=new int[len];
        for(int i=0; i<len;i++){
            while(!ls.isEmpty() && heights[i]<=heights[ls.peek()]){
                ls.pop();
            }
            if(ls.isEmpty()){
                lsa[i]=-1;
            }
            else{
                lsa[i]=ls.peek();
            }
            ls.push(i);
        }

        //Right smaller element

        Stack<Integer> rs=new Stack<>();
        int[] rsa=new int[len];
        for(int i=len-1;i>=0;i--){
            while(!rs.isEmpty() && heights[i]<=heights[rs.peek()]){
                rs.pop();
            }
            if(rs.isEmpty()){
                rsa[i]=len;
            }
            else{
                rsa[i]=rs.peek();
            }
            rs.push(i);
        }

        //Main logic

        int ans=0;
        for(int i=0;i<len;i++){
            int area=heights[i]*(rsa[i]-lsa[i]-1);
            ans=Math.max(ans,area);
        }
        return ans;
    }
}
