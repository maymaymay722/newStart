package EXercise;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(count(n));
        }
    }

    private static int count(int n) {
        // 一定是偶数（6,8 都是），最小是 6,10 以上偶数都可以
        if(n%2!=0 || n==10 || n<6){
            return -1;
        }
        // 如果拿八个拿完最好
        if(n%8==0){
            return n/8;
        }
        return 1+n/8;
    }
}
