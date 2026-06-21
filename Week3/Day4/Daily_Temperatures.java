package Week3.Day4;

import java.util.Stack;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<pair> st= new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0; i--){
            while(!st.isEmpty() && st.peek().num<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=(st.peek().ind)-i;
            }
            st.push(new pair(temperatures[i],i));

        }return ans;
    }

}
class pair{
    int num;
    int ind;

    pair(int num,int ind){
        this.num=num;
        this.ind=ind;
    }
}
