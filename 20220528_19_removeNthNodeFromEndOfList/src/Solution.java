class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode x = findFromEnd(dummy, n+1);   //倒数第n+1个，即前面一个
        x.next = x.next.next;
        return dummy.next;
    }

    public ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        for(int i = 0; i<k; i++){
            p1 = p1.next;
        }
        ListNode p2 = head;
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}