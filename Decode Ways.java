public class Solution{
  public int numDecodings(String s){
    if(s==null||s.length()==0)
      return 0;
    if(s.charAt(0)=='0')
      return 0;
    int[] dp=new int[s.length()+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=s.length();i++){
      String temp=s.substring(i-2,i);
      if(isvalid(temp)){
        dp[i]+=dp[i-2];
      }
      temp=s.substring(i-1,i);
      if(isvalid(temp)){
        dp[i]+=dp[i-1];
      }
    }
    return dp[s.length()];
  }
  private boolean isvalid(String str){
    if(str==null)
      return true;
    if(str.charAt(0)=='0')
      return false;
    int num=Integer.parseInt(str);
    return num>=1&&num<=26;
  }
}
