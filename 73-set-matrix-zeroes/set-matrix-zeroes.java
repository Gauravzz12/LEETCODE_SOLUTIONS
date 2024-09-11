class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] r=new int[m];
        int[] c=new int[n];

        Arrays.fill(r,-1);
        Arrays.fill(c,-1);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r[i]=0;
                    c[j]=0;
                }
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(r[i]==0 || c[j]==0){
                matrix[i][j]=0;
               }
            }
        }
    }
}