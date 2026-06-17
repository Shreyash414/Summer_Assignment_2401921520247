package Week3.Day3;

import java.util.Stack;

public class Min_Stack {
    Stack<Integer> st;
    Stack<Integer> min;
    public void MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }

    void push(int value) {
        st.push(value);
        if(min.isEmpty() || min.peek()>=value){
            min.push(value);
        }
    }

    void pop() {

        if(min.peek().equals(st.pop())){
            min.pop();
        }
    }

    int top() {
        return st.peek();
    }

    int getMin() {

        return min.peek();
    }
    // class MinStack {
//     class Pair {
//     int first;
//     int second;

//     Pair(int first, int second) {
//         this.first = first;
//         this.second = second;
//     }
// }
//     Stack<Pair> st;
//     public MinStack() {
//         st=new Stack<>();
//     }

//     public void push(int value) {
//        if(st.isEmpty()){
//         st.push(new Pair(value,value));
//        }
//        else{
//                 st.push(new Pair(value,Math.min((st.peek().second),value)));
//         }
//     }


//     public void pop() {
//         st.pop();
//     }

//     public int top() {
//         return st.peek().first;
//     }

//     public int getMin() {
//         return st.peek().second;
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(value);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */
}
