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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head.next==null){
        //     return null;
        // }
        int count=0;
        ListNode temp=head;
        ListNode temp1=head;

        while(count<n){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            head=head.next;
            return head;
        }
       while(temp.next!=null){
               temp=temp.next;
               temp1=temp1.next;
       }
       if(temp1.next==temp){
        temp1.next=null;
        return head;
       }
       temp1.next=temp1.next.next;
       return head;

    }
}