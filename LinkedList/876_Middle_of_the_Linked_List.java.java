/*
LeetCode 876 - Middle of the Linked List
Difficulty: Easy

Approach:
1. Use two pointers: slow and fast.
2. Move slow by one step and fast by two steps.
3. When fast reaches the end, slow will be at the middle node.
4. Return the slow pointer.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public static ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
              slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ans = middleNode(head);
        System.out.println("Middle Node: " + ans.val);
    }
}