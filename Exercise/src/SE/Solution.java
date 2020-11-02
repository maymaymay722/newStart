package SE;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    // 1！+2！+3！+4！+5！
    /*
    public static void main(String[] args) {
        // 方法一
        int num = 1;
        int sum = 0;
        while (num <= 5) {
            int factorResult = 1;
            int tmp = 1;
            while (tmp <= num) {
                factorResult *= tmp;
                tmp++;
            }
            sum += factorResult;
            num++;
        }
        System.out.println(sum);

        // 方法二
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            int tmp=1;
            for (int j = 1; j <= i; j++) {
                tmp *= j;
            }
            sum += tmp;
        }
        System.out.println(sum);
    }
    */

    // 猜数字
    /*
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int toGuess=random.nextInt(100);
        while(true){
            System.out.println("请输入要输入的数字：(1-100)");
            int num=sc.nextInt();
            if(num<toGuess){
                System.out.println("低了");
            }else if(num>toGuess){
                System.out.println("高了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }
    */

    /*
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(a, b);
    }
    public static void print(int x, int y) {
        System.out.println("x = " + x + " y = " + y);
    }
    */

    /*
    public static void main(String[] args) {
        int n=5;
        int ret=factor(n);
        System.out.println(ret);
    }

    private static int factor(int n) {
        if(n==1){
            return 1;
        }
        return n*factor(n-1);
    }
    */

    public static void main(String[] args) {
        int i=10;
        Integer ij=i;

        /*
        StringBuffer sb=new StringBuffer("helloworld");
        System.out.println(sb.toString());
        */

        /*
        String str = "helloworld" ;
        System.out.println(str.replaceAll("l", "_"));
        System.out.println(str.replaceFirst("l", "_"));
        */

        /*
        String str="helloworld!!!";
        char[] data=str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        System.out.println(new String(data));
        System.out.println(new String(data,5,5));
        */

        /*
        String str = "helloworld" ;
        System.out.println(str.indexOf("world")); // 5,w开始的索引
        System.out.println(str.indexOf("bit")); // -1，没有查到
        if (str.indexOf("hello") != -1) {
            System.out.println("可以查到指定字符串！");
        }
        */
    }
}
