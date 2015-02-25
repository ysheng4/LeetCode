/*
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
  public ListNode sortList(ListNode head){
    if(head==null||head.next==null)
      return head;
      ListNode slow=head;
      ListNode fast=head;
      while(fast.next!=null&&fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
      }
      ListNode first=head;
      ListNode second=slow.next;
      slow.next=null;
      ListNode l1=null;
      ListNode l2=null;
      if(first!=second){
        l1=sortList(first);
        l2=sortList(second);
      }
      return merger(l1,l2);
  
  }
  private ListNode merger(ListNode l1,ListNode l2){
    if(l1==null)
      return l2;
    if(l2==null)
      return l1;
    
    ListNode res=new ListNode(-1);
    ListNode p=res;
    while(l1!=null&&l2!=null){
      if(l1.val<l2.val){
        p.next=l1;
        l1=l1.next;
      }else{
        p.next=l2;
        l2=l2.next;
      }
      p=p.next;
    }
    if(l1!=null){
      p.next=l1;
    }
    if(l2!=null){
      p.next=l2;
    }
    return res.next;
    
  }
  
}
