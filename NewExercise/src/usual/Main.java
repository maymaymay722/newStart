import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(Solution(n));
        }
    }

    private static int Solution(int n) {
        if(n<=0 || n>36){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return Solution(n-1)+Solution(n-2);
    }
}
