package Dynamic;

public class Fibonacci {
    // 动态规划
    // 状态：F(n)
    // 状态递推：F(n)=F(n-1)+F(n-2)
    // 初始值：F(1)=F(2)=1
    // 返回结果：F(N)

    public int Fibonacci(int n){
        if(n<=0){
            return 0;
        }

        // 申请一个数组，保存子问题的解
        int[] array=new int[n+1];
        array[0]=0;
        array[1]=1;
        for (int i = 2; i <= n; ++i) {
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }
    /*
    空间复杂度为O(n)
    F(n) 只与它相邻的前两项有关，所以没必要保存所有子问题的解
    只要保存两个子问题的解就可以
     */

    // 空间复杂度 O(1)
    public int Fibonacci02(int n){
        // 初始值
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int ret=0;
        int fn1=1,fn2=1;
        for (int i = 3; i <= n; ++i) {
            ret=fn1+fn2;
            // 更新值
            fn1=fn2;
            fn2=ret;
        }
        return ret;
    }

    // 递归
    /*
    public int Fibonacci(int n){
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    */
    // 时间复杂度 O(2^n)，n增大，效率低下
    // 当输入比较大时，可能导致栈溢出，有大量重复计算
}
