public class Solution{
  public String reverseWords(String s){
    if(s==null)
    return s;
    String[] array=s.split(" ");
    StringBuilder sb=new StringBuilder();
      for(int i=array.length-1;i>=0;i--){
        if(!array[i].equals("")){
        sb.append(array[i]).append(" ");
      }
      }
      if(sb.length()==0)
        return "";
        
      return sb.toString().substring(0,sb.length()-1);
  }
}
