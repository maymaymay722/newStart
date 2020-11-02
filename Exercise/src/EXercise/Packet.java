package EXercise;

import java.util.Scanner;

public class Packet {
    static int[] weight;
    static int N;
    static int count=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            N=sc.nextInt();
            weight=new int[N+1];

            for (int i = 1; i <= N; i++) {
                weight[i]=sc.nextInt();
            }

            count(40,N);
            System.out.println(count);
        }
    }

    private static void count(int s, int n) {
        // s 为剩余物品重量
        // n 为剩余可选的物品个数
        // 如果背包容量刚好等于零，说明刚好装满
        if(s==0){
            ++count;
            return;
        }
        // s<0 或者 n<1 则不能完成
        if(s<0 || (s>0 && n<1)){
            return;
        }
        // 从最后一个开始装
        count(s-weight[n],n-1);
        // 如果最后一个和其他值都完了，从倒数第二个开始
        count(s,n-1);
    }
}
