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
    public ListNode doubleIt(ListNode head) {
    if (head == null) {
        return null;
    }
    if (head.next == null && head.val == 0) {
        return new ListNode(0);
    }
    ListNode reversed = reverseList(head);
    ListNode current = reversed;
    int carry = 0;
    while (current != null) {
        int newVal = current.val * 2 + carry;
        current.val = newVal % 10;
        carry = newVal / 10;
        if (current.next == null && carry > 0) {
            current.next = new ListNode(carry);
            break; 
        }
        current = current.next;
    }
    return reverseList(reversed);
}
private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}


}