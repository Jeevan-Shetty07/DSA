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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> num=new HashSet<>();
        for(int n:nums){
            num.add(n);
        }
        while(num.contains(head.val)){
            head=head.next;
        }
        ListNode trav=head;
        while(trav.next!=null){
            if(num.contains(trav.next.val)){
                if(trav.next.next==null){
                    trav.next=null;
                    return head;
                }else{
                trav.next=trav.next.next;
                continue;
                }
            }
            trav=trav.next;
        }
        return head;
    }
}