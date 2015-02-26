public class Solution{
  public List<Integer> grayCode(int n){
  
    List<Integer> res=new ArrayList<>();
    res.add(0);
    if(n==0)
      return res;
    
  //res.add(0);
  for(int i=1;i<=n;i++){
    int size=res.size();
    for(int j=0;j<size;j++){
      res.add(res.get(j)+size);
    }
  }
  return res;
  }
}
