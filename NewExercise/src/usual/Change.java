package usual;

public class Change {
    // 临时变量实现
    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    // 加法实现
    private void swap02(int[] array,int i,int j){
        if(i!=j){
            array[i]=array[i]+array[j];
            array[j]=array[i]-array[j];
            array[i]=array[i]-array[j];
        }
    }

    // 减法实现
    private void swap03(int[] array,int i,int j){
        if(i!=j){
            array[i]=array[i]-array[j];
            array[j]=array[i]+array[j];
            array[i]=array[j]-array[i];
        }
    }

    // 乘法实现
    private void swap04(int[] array,int i,int j){
        if(i!=j){
            array[i]=array[i]*array[j];
            array[j]=array[i]/array[j];
            array[i]=array[i]/array[j];
        }
    }

    // 异或运算符实现
    private void swap05(int[] array,int i,int j){
        if(i!=j){
            array[i] ^= array[j];
            array[j] ^= array[j];
            array[i] ^= array[j];
        }
    }
}
