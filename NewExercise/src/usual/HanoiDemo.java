package usual;

import java.util.Stack;

public class HanoiDemo {
    // 表示的是把 n 个圆盘成功的从 A 移动到 C
    public static void hanoi(int n,char A,char B,char C){
        if(n==1){
            // 如果只有一个，直接从A移动到C即可
            System.out.println("从"+A+"移动到"+C);
        }else{
            // 表示先把n-1个圆盘成功从A移动到B
            hanoi(n-1,A,C,B);
            // 把第n个圆盘从A移动到C
            System.out.println("从"+A+"移动到"+C);
            hanoi(n-1,B,A,C);
        }
    }

    // 把柱子看成一个栈
    public static void move(Stack stackA,Stack stackB,Stack stackC,int n){
        if(n==1){
            stackC.push(stackA.pop());
        }else{
            move(stackA,stackC,stackB,n-1);
            stackC.push(stackA.pop());
            move(stackB,stackA,stackC,n-1);
        }
    }
}
