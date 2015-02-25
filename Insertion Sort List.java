/*
  Definition for a singly-linked list.
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
  public ListNode insertionSortList(ListNode head){
    if(head==null)
     return null;
    ListNode res=new ListNode(-1);
    ListNode p=res;
    ListNode cur=head;
    while(cur!=null){
      p=res;
      while(p.next!=null&&p.next.val<cur.val){
        p=p.next;
      }
      ListNode next=cur.next;
      cur.next=p.next;
      p.next=cur;
      cur=next;
    }
    return res.next;
  }
}
