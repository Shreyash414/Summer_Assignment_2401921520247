package Week1.Day4;

public class Matrlx_Reshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        if((row*col)!=(r*c)) return mat;
        if(row==r && col==c) return mat;

        int o=0;
        int n=0;

        while(n<r*c && o<row*col){
            ans[n/c][n%c]=mat[o/col][o%col];
            n++;
            o++;
        }
        return ans;
    }
}
