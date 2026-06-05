package Week1.Day4;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int row = mat.length;
        int col = mat[0].length;

        int n=row-1;
        for (int i=0; i<row;i++){
            sum=sum + mat[i][i] + mat[i][n];
            n--;
        }
        if(row%-2!=0){
            sum-=mat[row/2][row/2];
        }

        return sum;
    }
}
