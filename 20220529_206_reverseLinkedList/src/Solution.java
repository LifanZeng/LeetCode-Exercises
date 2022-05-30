class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = curr;
        while(curr!=null){
            temp = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}