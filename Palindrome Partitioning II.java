public class Solution{
  public int minCut(String s){
    int len=s.length();
    boolean[][] matrix=new boolean[len][len];
    int[] dp=new int[len+1];
    for(int i=0;i<len;i++){
      dp[i]=len-i;
    }
    for(int i=len-1;i>=0;i--){
      for(int j=i;j<len;j++){
        if((s.charAt(i)==s.charAt(j)&&j-i<2)||(s.charAt(i)==s.charAt(j)&&matrix[i+1][j-1])){
          matrix[i][j]=true;
          dp[i]=Math.min(dp[i],dp[j+1]+1);
        }
          
      }
    }
    return dp[0]-1;
  }

}
