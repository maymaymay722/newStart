package SJJG;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public MyStack(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    // push
    public void push(int x){
        q1.add(x);
        top=x;
    }

    // pop
    public void pop(){
        while(q1.size()>1){
            top=q1.remove();
            q2.add(top);
        }
        q1.remove();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
}
