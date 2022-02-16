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
public class Solution {

public ListNode swapPairs(ListNode head) {
    
    if(head == null) return head;
    ListNode current = head;
    while(current.next != null){
        int t = current.val;
        current.val = current.next.val;
        current.next.val = t;
        
        if(current.next.next != null){
            current = current.next.next;
        } else {
            break;
        }
    }
    return head;
    }
}