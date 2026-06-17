package Week3.Day3;

import java.util.Stack;

public class Valid_Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(st.isEmpty() || k=='{' || k=='(' || k=='['){
                st.push(k);
            }
            else{
                if(st.peek()=='{' && k=='}'){
                    st.pop();
                }
                else if(st.peek()=='(' && k==')'){
                    st.pop();
                }
                else if(st.peek()=='[' && k==']'){
                    st.pop();
                }
                else{
                    st.push(k);
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
