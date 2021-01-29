import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleMinimumPathSum {
    public static int minimumTotal(List<List<Integer>> triangle){
        //三角形的行数
        int n =triangle.size();
        int [][]dp=new int[n][n];
        //最后一行
        List<Integer> lastRow = triangle.get(n - 1);

        for (int i = 0; i < n; ++i) {
            dp[n - 1][i] = lastRow.get(i);
        }
        for (int i = n - 2; i >= 0; --i) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < i + 1; ++j) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + row.get(j);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> data1=new ArrayList<>();
        List<Integer> data2=new ArrayList<>();
        List<Integer> data3=new ArrayList<>();
        List<Integer> data4=new ArrayList<>();

        data1.add(2);
        data2.add(3);
        data2.add(4);
        data3.add(6);
        data3.add(5);
        data3.add(7);
        data4.add(4);
        data4.add(1);
        data4.add(8);
        data4.add(3);


        triangle.add(data1);
        triangle.add(data2);
        triangle.add(data3);
        triangle.add(data4);

        System.out.println(triangle);
        int minTotal=minimumTotal(triangle);
        System.out.println(minTotal);

    }
}
