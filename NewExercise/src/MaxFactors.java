public class MaxFactors {
    // 13195的所有质因数为5、7、13和29。
    public static long primeFactors(long number){
        if(number==1){
            return 1;
        }
        for (int i = 2; i < number; i++) {
            if(number % i==0){
                return primeFactors(number/i);
            }
        }
        return number;
    }
}
