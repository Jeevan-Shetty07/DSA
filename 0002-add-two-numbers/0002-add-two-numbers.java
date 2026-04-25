/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode h1=l1,h2=l2;
      ListNode dummy=new ListNode(0,null);
      ListNode trav=dummy;
      int sum,rem=0;
      while(h1!=null || h2!=null){
             ListNode node=new ListNode(0,null);
             sum=(h1==null?0:h1.val)+(h2==null?0:h2.val)+rem;
             if(sum>9){
                rem=1;
                node.val=sum-10;     
             }else{
                node.val=sum;
                rem=0;
             }
             trav.next=node;
             trav=trav.next;
             h1=h1!=null?h1.next:null;
             h2=h2!=null?h2.next:null;
      }
      if(rem!=0){
        trav.next=new ListNode(rem,null);
      }
      return dummy.next;
    }
}