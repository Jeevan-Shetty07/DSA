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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1, null);
        ListNode trav = dummy;
        while (head != null && head.next!=null) {
            if (head.val == head.next.val) {
                int temp = head.val;
                while (head!=null && head.val == temp) {
                    head = head.next;
                }
               
            } else {
                ListNode temp1 = head.next;
                trav.next = head;
                trav=trav.next;
                head.next = null;
                head = temp1;
            }
        }
        trav.next=head;
        return dummy.next;
    }
}