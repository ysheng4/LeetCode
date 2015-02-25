public class Solution{
  public int evalRPN(String[] tokens){
    if(tokens.length==0)
    return 0;
    String str="+-*/";
    Stack<String> stack=new Stack<>();
    for(String e:tokens){
      if(!str.contains(e)){
        stack.push(e);
      }else{
        int a=Integer.valueOf(stack.pop());
        int b=Integer.valueOf(stack.pop());
        int index=str.indexOf(e);
        switch(index){
          case 0:
            stack.push(String.valueOf(a+b));
            break;
          case 1:
            stack.push(String.valueOf(b-a));
            break;
          case 2:
            stack.push(String.valueOf(a*b));
            break;
          case 3:
            stack.push(String.valueOf(b/a));
            break;
        }
      }
    }
    return Integer.valueOf(stack.pop());
  }
}
