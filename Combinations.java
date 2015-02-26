public class Solution{
  public List<List<Integer>> combine(int n,int k){
    List<List<Integer>> res=new ArrayList<>();
    if(n==0)
      return res;
    
    List<Integer> com=new ArrayList<>();
    helper(n,k,res,com,1);
    return res;
    
  }
  private void helper(int n,int k,List<List<Integer>> res,List<Integer> com, int start){
    if(com.size()==k){
      res.add(new ArrayList<>(com));
      return;
    }
    for(int i=start;i<=n;i++){
      com.add(i);
      helper(n,k,res,com,i+1);
      com.remove(com.size()-1);
    }
    
  }
}
