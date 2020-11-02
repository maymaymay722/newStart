package SE;

import java.util.Arrays;

public class daily {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5,7,9};
        int[] ret=reverse(arr);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] reverse(int[] array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;

            left++;
            right--;
        }
        return array;
    }

    // 二分查找
    public static int binarySearch(int[] array,int n){
        int  left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(n<array[mid]){
                right=mid-1;
            }else if(n>array[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
