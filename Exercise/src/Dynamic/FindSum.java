package Dynamic;

public class FindSum {
    public int FindGreatestSumOfSubArray(int[] array){
        int maxSum=array[0];
        int curSum=array[0];
        for (int i = 1; i < array.length; i++) {
            curSum=Math.max(curSum+array[i],array[i]);
            if(curSum>maxSum){
                maxSum=curSum;
            }
        }
        return maxSum;
    }
}
