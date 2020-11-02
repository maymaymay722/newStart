package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class Path {
    // 方法：动态规划

    // 状态：
    // 子状态：从(0,0)到达(1,0),(1,1),(2,1),...(m-1,n-1)的路径数
    // F(i,j): 从(0,0)到达F(i,j)的路径数

    // 状态递推：
    // F(i,j) = F(i-1,j) + F(i,j-1)

    // 初始化：
    // 特殊情况：第0行和第0列
    // F(0,i) = 1
    // F(i,0) = 1

    // 返回结果：
    // F(m-1,n-1)
    public int uniquePaths(int m,int n){
        List<List<Integer>> pathNum=new ArrayList<>();
        // 申请F(i,j)空间，初始化
        for (int i = 0; i < m; i++) {
            pathNum.add(new ArrayList<>());
            pathNum.get(i).add(1);
        }
        for (int i = 1; i < n; i++) {
            pathNum.get(0).add(1);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                pathNum.get(i).add(pathNum.get(i).get(j-1)+pathNum.get(i-1).get(j));
            }
        }
        return pathNum.get(m-1).get(n-1);
    }

    public int minPathSum(int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        // 如果为空或者只有一行，返回0
        if(row==0 || col==0){
            return 0;
        }
        // F(0,0),F(0,i),F(i,0)初始化
        for (int i = 1; i < row; i++) {
            grid[i][0]=grid[i-1][0]+grid[i][0];
        }
        for (int i = 1; i < col; i++) {
            grid[0][i]=grid[0][i-1]+grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }
}