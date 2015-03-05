/*
  Definition for the singly-linked list
  class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
      val=x;
      next=null;
    }
  }
*/

public class Solution{
  public ListNode detectCycle(ListNode head){
    if(head==null)
      return head;
      
    ListNode p=head;
    p.val=Integer.MIN_VALUE;
    while(p.next!=null){
        p=p.next;
        if(p.val==Integer.MIN_VALUE)
          return p;
        p.val=Integer.MIN_VALUE;
        
    }
    return null;
  }
}
