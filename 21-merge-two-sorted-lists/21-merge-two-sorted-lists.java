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
class Solution 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        
        ListNode t1 = new ListNode();
        t1 = l1;
        
        ListNode t2 = new ListNode();
        t2 = l2;
        
        if(t1==null) return t2;
        if(t2==null) return t1;
        
        ListNode dummy = new ListNode();
        
        if(t1.val<=t2.val)
        {
            dummy.next=t1;
        }
        else
        {
            dummy.next=t2;
        }
        
        ListNode helper = dummy;
        
        while(t1!=null&&t2!=null)
        {
            if(t1.val<=t2.val)
            {
                helper.next = t1;
                t1 = t1.next;
            }
            else
            {
                helper.next = t2;
                t2 = t2.next;
            }
            helper = helper.next;
        
        }
        while(t1!=null)
        {
            helper.next = t1;
            helper=helper.next;
            t1=t1.next;
        }
        
        while(t2!=null)
        {
            helper.next = t2;
             helper=helper.next;
            t2=t2.next;
            
        }
        return dummy.next;
    }
}