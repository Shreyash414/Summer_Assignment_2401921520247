package Week3.Day5;

import java.util.Stack;

class MyQueue {
    Stack<Integer> ip;
    Stack<Integer> op;

    public  MyQueue() {
        ip=new Stack<>();
        op=new Stack<>();
    }

    public void push(int x) {
        ip.push(x);
    }

    public int pop() {
        if(!op.isEmpty()){
            return op.pop();
        }
        else{
            while(!ip.isEmpty()){
                op.push(ip.pop());
            }
            return op.pop();
        }
    }

    public int peek() {
        if(!op.isEmpty()){
            return op.peek();
        }
        else{
            while(!ip.isEmpty()){
                op.push(ip.pop());
            }
            return op.peek();
        }
    }

    public boolean empty() {
        if(op.isEmpty() && ip.isEmpty()){
            return true;
        }
        return false;
    }
}
