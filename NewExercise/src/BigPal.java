public class BigPal {
    //回文数就是从前往后和从后往前读都一样的数。
    // 由两个2位数相乘得到的最大回文乘积是 9009 = 91 × 99。
    // 找出由两个3位数相乘得到的最大回文乘积。
    public static int bigPalinddrome(){
        int num=0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int product=i*j;
                if(product>num && palindrome(product)){
                    num=product;
                }
            }
        }
        return num;
    }

    private static boolean palindrome(int num) {
        int bitCount=0;
        int[] bit=new int[10];
        while(num!=0){
            bit[bitCount++]=num%10;
            num /= 10;
        }
        for (int i = 0; i < bitCount >> 1; i++) {
            if(bit[i]!=bit[bitCount-i-1]){
                return false;
            }
        }
        return true;
    }
}
