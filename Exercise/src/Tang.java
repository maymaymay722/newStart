import java.util.Scanner;

class ListNode{
    ListNode next;
    ListNode(){
        this.next=null;
    }
}
public class Tang {
    public ListNode reverseList(ListNode head){
        ListNode result=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=result;
            cur=next;
        }
        return result;
    }

    public static void quickSort(int[] array){
        if(array.length==0){
            return;
        }
        quickSortInter(array,0,array.length-1);
    }
    public static void quickSortInter(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int pivotIndex=partition(array,left,right);
        quickSortInter(array,left,pivotIndex-1);
        quickSortInter(array,pivotIndex+1,right);
    }
    public static int partition(int[] array,int left,int right){
        int begin=left;
        int end=right;
        int pivot=array[left];

        while(begin<end){
            while(begin<end && array[end]>=pivot){
                end--;
            }
            while(begin<end && array[begin]<=pivot){
                begin++;
            }
            swap(array,begin,end);
        }
        swap(array,left,begin);
        return begin;
    }

    private static void swap(int[] array, int begin, int end) {
        int tmp=array[begin];
        array[begin]=array[end];
        array[end]=tmp;
    }
/*
    public static int res(int n){
        if(n<3){
            return n;
        }
        int n1=1;
        int n2=2;
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        return sum;
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        return res(n-1)+res(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(res(n));
        }
    }
*/
}
