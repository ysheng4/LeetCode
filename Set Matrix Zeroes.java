public class Solution{
  public void setZeroes(int[][] matrix){
    if(matrix==null)
      return;
    int m=matrix.length;
    int n=matrix[0].length;
    int[] flagx=new int[m];
    int[] flagy=new int[n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(matrix[i][j]==0){
          flagx[i]=1;
          flagy[j]=1;
        }
      }
    }
    
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(flagx[i]==1||flagy[j]==1)
          matrix[i][j]=0;
      }
    }
    
    
  }
}
