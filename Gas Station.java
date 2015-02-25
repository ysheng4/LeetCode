public class Solution{
  public int canCompleteCircuit(int[] gas,int[] cost){
    int sum=0;
    int max=0;
    int index=-1;
    for(int i=0;i<gas.length;i++){
      sum+=gas[i]-cost[i];
      max+=gas[i]-cost[i];
      if(sum<0){
        sum=0;
        index=i;
      }
    }
    if(max<0)
      return -1;
    return index+1;
    
  }
}
