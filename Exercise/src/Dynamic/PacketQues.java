package Dynamic;

public class PacketQues {
    // F(i,j)：前 i 个物品放入大小为 j 的背包中所获得的最大价值

    // 初始化：第0行 和 第0列都为0，表示没有装物品时的价值都为0
    // F(0,j)=F(i,0)=0

    // n 个物品，大小为 m 的背包
    // 数组 A 表示每个物品的大小
    // 数组 V 表示每个物品的价值
    public int backPack(int m,int[] A,int[] V){
        int num=A.length;
        if(m==0 || num==0){
            return 0;
        }
        int[][] maxValue=new int[num+1][m+1];
        for (int i = 0; i <= num; i++) {
            maxValue[i][0]=0;
        }
        for (int i = 1; i <= m; i++) {
            maxValue[0][i]=0;
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= m; j++) {
                if (A[i-1]>j) {
                    maxValue[i][j]=maxValue[i-1][j];
                }else{
                    int newValue=maxValue[i-1][j-A[i-1]]+V[i-1];
                    maxValue[i][j]=Math.max(newValue,maxValue[i-1][j]);
                }
            }
        }
        return maxValue[num][m];
    }
}
