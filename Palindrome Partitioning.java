public class Solution{
  public List<List<String>> partition(String s){
    List<List<String>> res=new ArrayList<>();
    if(s==null)
      return res;
    
    List<String> com=new ArrayList<>();
    helper(s,res,com,0);
    return res;
  
  
  }
  
  public void helper(String s,List<List<String>> res,List<String> com,int start){
    if(start==s.length()){
      res.add(new ArrayList<>(com));
      return;
    }
    for(int i=start+1;i<=s.length();i++){
      String str=s.substring(start,i);
      if(isvalid(str)){
        com.add(str);
        helper(s,res,com,i);
        com.remove(com.size()-1);
      }
    }
  }
  
  private boolean isvalid(String s){
    int left=0;
    int right=s.length()-1;
    if(left>right)
      return false;
    while(left<=right){
      if(s.charAt(left)!=s.charAt(right))
        return false;
      left++;
      right--;
    }
    
    return true;
  }
}
