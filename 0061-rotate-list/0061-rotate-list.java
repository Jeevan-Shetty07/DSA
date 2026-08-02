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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        ListNode first = head, last = head, prev = null;
         int num=0;
        while(last!=null){
               last=last.next;
               num++;
        }
        if(num<k){
            k=k%num;
        }
        if(k%num==0){
            return head;
        }
        last=head;

        int firsti = 0, lasti = 0;
        while (last.next != null) {

            last = last.next;
            lasti++;
            if (lasti - firsti == k) {
                prev = first;
                first = first.next;
                firsti++;
            }
        }
        prev.next = null;
        last.next = head;
        return first;

    }
}