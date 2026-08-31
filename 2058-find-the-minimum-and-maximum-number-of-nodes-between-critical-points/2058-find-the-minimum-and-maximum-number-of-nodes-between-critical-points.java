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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head.next, prev = head;
        int pos = 2;
        while (temp.next != null) {
            if ((temp.val < temp.next.val && temp.val < prev.val)
                    || (temp.val > temp.next.val && temp.val > prev.val)) {
                al.add(pos);

            }
            pos++;
            prev = temp;
            temp = temp.next;

        }
        if(al.size()<=1){
            return new int[]{-1,-1};
        }
      int min=99999;
        for(int i=1;i<al.size();i++){
                min=Math.min(min,al.get(i)-al.get(i-1));
        }
     
        return new int[] { min,  al.get(al.size() - 1) - al.get(0) };
    }
}