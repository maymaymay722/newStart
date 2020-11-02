package SE;

import java.util.Arrays;


public class Arr {
    public static void transform(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && arr[left]%2 == 0){
                left++;
            }
            while(left<right && arr[right]%2 !=0){
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
    }

    public static int binarySearch(int[] arr,int toFind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(toFind<arr[mid]){
                right=mid-1;
            }else if(toFind>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 偶数在前，奇数在后
        int[] arr={1,2,3,4,5,6};
        transform(arr);
        System.out.println(Arrays.toString(arr));

        // 二分查找
        //int[] arr={1,2,3,4,5,6};
        //System.out.println(binarySearch(arr,6));

        // 数组拷贝
        //int[] arr={1,2,3,4,5,6};
        //int[] newArr=Arrays.copyOf(arr,arr.length);
        //System.out.println("newArr："+Arrays.toString(newArr));

        //arr[0]=10;
        //System.out.println("new："+Arrays.toString(arr));
        //System.out.println("newArr："+Arrays.toString(newArr));

        // 数组转字符串
        //int[] arr={1,2,3,4,5,6};
        //String newArr= Arrays.toString(arr);
        //System.out.println(newArr);
        // [1, 2, 3, 4, 5, 6]
    }

    /*
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] out=transform(arr);
        printArray(arr);
    }

    private static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*2;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    */
}
