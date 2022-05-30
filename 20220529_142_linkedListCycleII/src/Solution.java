public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null){  // LinkedList circle 范式
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }

        if(fast == null || fast.next == null){      //空表或者只有一个节点，返回null.
            return null;
        }

        slow = head;
        while (slow != fast){   //此时 fast 和 slow 同速，slow 从 head 开始， fast 从相遇点开始，大家都走 k-m 步以后相遇于环起点。
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
