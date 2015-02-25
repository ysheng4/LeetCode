public class Solution{
  public int singleNumber(int[] A){
    if(A.length==0)
      return 0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<A.length;i++){
      if(map.containsKey(A[i])){
        map.put(A[i],map.get(A[i])+1);
      }else{
        map.put(A[i],1);
      }
    
    }
    Iterator<Map.Entry<Integer,Integer>> iterator=map.entrySet().iterator();
    while(iterator.hasNext()){
      Map.Entry<Integer,Integer> entry=iterator.next();
      if(entry.getValue()!=3)
        return entry.getKey();
    }
    
    return 0;
  
  }


}
