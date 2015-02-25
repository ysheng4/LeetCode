public class Solution{
  public int maxProduct(int[] A){
    if(A.length==0)
    return 0;
    
    int res=A[0];
    int max=A[0];
    int min=A[0];
    for(int i=1;i<A.length;i++){
      int a=max*A[i];
      int b=min*A[i];
      max=Math.max(A[i],Math.max(a,b));
      min=Math.min(A[i],Math.min(b,a));
      res=Math.max(res,max);
      
    }
    return res;
  }
}
