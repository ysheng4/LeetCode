public class Solution{
  public List<List<Integer>> subsetsWithDup(int[] num){
    List<List<Integer>> res=new ArrayList<>();
    if(num.length==0)
      return res;
    Arrays.sort(num);
    List<Integer> cur=new ArrayList<>();
    res.add(cur);
    HashSet<List<Integer>> set=new HashSet<>();
    for(int i=0;i<num.length;i++){
      int size=res.size();
      for(int j=0;j<size;j++){
        List<Integer> com=new ArrayList<>(res.get(j));
        com.add(num[i]);
        if(!set.contains(com)){
          set.add(com);
          res.add(com);
        }
      
      }
    }
    return res;
  }
}
