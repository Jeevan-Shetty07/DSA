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
    ListNode temp;
    int n;
     ArrayList<Integer> arr=new ArrayList<>();
    public Solution(ListNode head) {
         n=0;
         temp=head;
        while(temp!=null){
            arr.add(temp.val);
            n++;
            temp=temp.next;
        }
    }
    
    public int getRandom() {
           return arr.get((int)(Math.random()*n));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */