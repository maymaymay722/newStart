import java.util.Scanner;

public class Solution {
    public static int house(int[] person){
        int count=0;
        int[] array=new int[person.length];
        // 不考虑人数，所分得房
        for (int i = 0; i < array.length; i++) {
            array[i]=1;
        }

        for (int i = 1; i < person.length-1; i++) {
            if(person[i]<person[i-1] && person[i]<person[i+1]){
                array[i-1]=array[i]+1;
                array[i+1]=array[i]+1;
            }
            if(person[i]>person[i-1] && person[i]>person[i+1]){
                if(array[i-1]>=array[i+1]) {
                    array[i] = array[i-1] + 1;
                }else{
                    array[i] = array[i+1] + 1;
                }
            }
            if(person[i]<person[i-1] && person[i]>person[i+1]){
                array[i]=array[i+1]+1;
                array[i-1]=array[i]+1;
            }
            if(person[i]>person[i-1] && person[i]<person[i+1]){
                array[i]=array[i-1]+1;
                array[i+1]=array[i]+1;
            }
            if(person[i]==person[i-1]){
                continue;
            }
            if(person[i]==person[i+1]){
                continue;
            }
        }
        // 分的房相加
        for (int i = 0; i < array.length; i++) {
            count=count+array[i];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] person=new int[N];
        for (int i = 0; i < N; i++) {
            person[i]=sc.nextInt();
        }
        System.out.println(house(person));
    }
}
