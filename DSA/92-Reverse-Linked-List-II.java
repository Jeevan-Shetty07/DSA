class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null || left == right)
            return head;

        ListNode prev = null;
        ListNode temp = head;

     
        for (int i = 1; i < left; i++) {
            prev = temp;
            temp = temp.next;
        }

        ListNode first = temp;


        for (int i = left; i < right; i++) {
            temp = temp.next;
        }

     
        ListNode last = temp.next;

     
        temp.next = null;

        ListNode curr = first;
        ListNode prevNode = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }

   

     
        if (prev == null) {
            head = prevNode;
        } else {
            prev.next = prevNode;
        }


        first.next = last;

        return head;
    }
}