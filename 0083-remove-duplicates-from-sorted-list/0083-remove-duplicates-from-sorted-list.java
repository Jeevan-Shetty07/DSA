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
        if(head==null){
            return null;
        }else if(head.next==null){
            return head;
        }
        ListNode trav1=head,trav2=head.next;
        while(trav2!=null){
            if(trav1.val==trav2.val){
                trav1.next=trav2.next;
                trav2=trav1.next;
            }else{
                 trav1=trav1.next;
                 trav2=trav2.next;
            }
        }
        return head;

        
    }
}