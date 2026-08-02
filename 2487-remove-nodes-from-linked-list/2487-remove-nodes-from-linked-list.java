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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> rev = new Stack<>();

        while (head != null) {
            rev.push(head);
            head = head.next;
        }
        head=rev.peek();
        int max=0;
        while (head != null) {
            if(head.val<max){
                ListNode temp=rev.pop();
                if(rev.isEmpty()){
                
                    return temp.next;
                }
                rev.peek().next=temp.next;
                temp.next=null;
                head=rev.peek();
                continue;
            }
            else{
                ListNode  temp=rev.peek();
                max=  rev.pop().val;
                if(rev.isEmpty()){
                    return temp;
                }
              
                head=rev.peek();
            }
            
        }
        return head;
    }
}