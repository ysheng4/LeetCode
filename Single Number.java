public class Solution{
  public int singleNumber(int[] A){
    if(A.length==0)
      return 0;
    
    int res=A[0];
    for(int i=1;i<A.length;i++){
      res=res^A[i];
    }
    return res;
  }
}
