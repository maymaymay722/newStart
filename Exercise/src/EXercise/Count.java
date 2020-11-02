package EXercise;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(drink(n));
        }
    }

    private static int drink(int n) {
        int total=0;
        while(n>2){
            total=n+n/3;
            n=n/3+n%3;
        }
        if(n==2){
            total=total+1;
        }
        return total;
    }
}
