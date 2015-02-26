public class Solution{
  public List<List<Integer>> subsets(int[] S){
    List<List<Integer>> res=new ArrayList<>();
    if(S.length==0)
      return res;
    Arrays.sort(S);
    List<Integer> cur=new ArrayList<>();
    res.add(cur);
    for(int i=0;i<S.length;i++){
      int size=res.size();
      for(int j=0;j<size;j++){
        List<Integer> com=new ArrayList<>(res.get(j));
        com.add(S[i]);
        res.add(com);
        
      }
    }
    return res;
  }
}
