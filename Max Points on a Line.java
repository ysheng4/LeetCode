/*Definition for a point
  public class Point{
    int x;
    int y;
    Point(){
      x=0;
      y=0;
    }
    Point(int a,int b){
      x=a;
      y=b;
    }
  }
*/

public class Solution{
  public int maxPoints(Point[] points){
    if(points.length==0)
      return 0;
    if(points.length==1)
      return 1;
  
    Point p1,p2;
   // int max=1;
    int res=1;
    HashMap<Double,Integer> map=new HashMap<>();
    for(int i=0;i<points.length;i++){
      p1=points[i];
      map.clear();
      double k=0;
      int temp=1;
      for(int j=0;j<points.length;j++){
        p2=points[j];
        if(i==j)
          continue;
        if(p1.x==p2.x&&p1.y==p2.y){
          temp++;
        }else{
          if(p1.x==p2.x){
            k=Double.MAX_VALUE;
          }else{
            k=((double)p1.y-(double)p2.y)/((double)p1.x-(double)p2.x);
          }
          if(map.containsKey(k)){
          map.put(k,map.get(k)+1);
        }else{
          map.put(k,1);
        }
          
        }
      }
      int count=0;
      for(Integer number:map.values()){
        if(number>count)
          count=number;
      }
      if(count+temp>res)
        res=count+temp;
      
      
    }
    
    return res;
  
  }
}
