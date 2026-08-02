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
    public ListNode doubleIt(ListNode head) {
        ListNode nHead = head,extra=null;
        boolean isExtra = false;
        if (head.val >= 5) {
             extra = new ListNode(1, head);
            isExtra = true;
        }
        while (head != null) {
            int carry = 0;
            if (head.next != null && head.next.val >= 5) {
                carry = 1;
            }
            head.val = ((head.val * 2) + carry)%10;
            head=head.next;
        }
        return isExtra ? extra : nHead;
    }
}