public class Solution{
  public int longestConsecutive(int[] num){
    if(num.length==0)
      return 0;
    
    HashSet<Integer> stack=new HashSet<>();
    for(Integer number:num){
      stack.add(number);
    }
    int res=1;
    for(Integer e:num){
      int temp=1;
      int left=e-1;
      int right=e+1;
      while(stack.contains(left)){
        
        temp++;
        stack.remove(left);
        left--;
      }
      while(stack.contains(right)){
        
        temp++;
        stack.remove(right);
        right++;
      }
      res=Math.max(temp,res);
    }
    return res;
    
  }
}
