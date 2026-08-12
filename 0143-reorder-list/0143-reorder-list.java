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
    public void reorderList(ListNode head) {
        ListNode dummy=new ListNode(-1,head);
        Stack<ListNode> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
      ListNode bottom=dummy.next;
      while(stack.peek()!=bottom){
         ListNode next=bottom.next;
         bottom.next=stack.peek();
         bottom=next;
         if(stack.peek()==bottom){
            break;
         }
         stack.peek().next=bottom;
         stack.pop();

      }
      stack.peek().next=null;
    //   return dummy.next;
    }  
}