/*
LeetCode 206 - Reverse Linked List
Difficulty: Easy

Approach:
1. Initialize three pointers:
   - prev = null
   - curr = head
   - next = null
2. Traverse the linked list.
3. Reverse the current node's next pointer.
4. Move all pointers one step forward.
5. Return prev as the new head.

Time Complexity: O(n)
Space Complexity: O(1)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }
        return prev;
    }
}