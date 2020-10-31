package Dynamic;

import java.util.HashMap;

public class JumpFrog {
    // 一次可以跳一级 或 二级
    public static int f(int n){
        if(n<3){
            return n;
        }
        return f(n-1)+f(n-2);
    }

    public static int f2(int n, HashMap<Integer,Integer> map){
        if(n<3){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int first=f2(n-1,map);
        int second=f2(n-2,map);
        int sum=first+second;
        map.put(n,sum);
        return sum;
    }

    public static int f3(int n){
        if(n<3){
            return n;
        }
        int first=1;
        int second=2;
        int sum=0;
        while(n-- > 2){
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }

    // 一次可以跳 n 级
    private static int f4(int n){
        if(n==1){
            return 1;
        }
        return f4(n-1)*2;
    }
    private static int f5(int n){
        if(n==1){
            return 1;
        }
        return 1<<(n-1);
    }

    // 一共有 n 级台阶
    // 一次可以跳 m 级
    public static int f6(int n,int m){
        if(n<=1){
            return 1;
        }
        // 总台阶大于跳的最高级台阶
        if(n>m){
            return 2*f6(n-1,m)-f6(n-1-m,m);
        }
        return 2*f6(n-1,n);
    }
}
