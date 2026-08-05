/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNodcclaue() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode(-1, null);
        ListNode h = start;
        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                h.next = list1;
                list1 = list1.next;
                h.next.next = null;
                h = h.next;
            } else {
                h.next = list2;
                list2 = list2.next;
                h.next.next = null;
                h = h.next;

            }
        }
        h.next = list1 != null ? list1 : list2;
        return start.next;

    }
}