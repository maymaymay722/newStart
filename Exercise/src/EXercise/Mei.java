package EXercise;

import java.util.Arrays;
import java.util.Scanner;

public class Mei {
    public static boolean checkSam(String strA,String strB){
        if(strA==null || strB==null || strA.length()==0 || strB.length()==0){
            return false;
        }
        if(strA.length()!=strB.length()){
            return false;
        }else{
            char[] A=strA.toCharArray();
            char[] B=strB.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);

            for (int i = 0; i < A.length; i++) {
                if(A[i]==B[i]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        System.out.println(checkSam(A,B));
    }
}
