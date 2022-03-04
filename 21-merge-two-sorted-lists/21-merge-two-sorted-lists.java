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
        ListNode dummy = new ListNode();
        
        ListNode handler = dummy;
        
        if(l1==null) return l2;
        if(l2==null) return l1;
        
         ListNode t1 =l1 , t2=l2;
        
        while(t1!=null && t2!=null)
        {
            
            if(t1.val<=t2.val)
            {
                ListNode nn = new ListNode();
               
                nn.val=t1.val;
                 handler.next = nn;
                t1=t1.next; 
            }
            else
            {
                ListNode nn = new ListNode();
                handler.next = nn;
                nn.val = t2.val;
                t2=t2.next;
            }
            handler=handler.next;
        }
        while(t1!=null)
        {
            ListNode nn = new ListNode();
            handler.next = nn;
            nn.val=t1.val;
            t1=t1.next;
            handler=handler.next;
        }
        while(t2!=null)
        {
            ListNode nn = new ListNode();
            handler.next = nn;
            nn.val=t2.val;
            t2=t2.next;
            handler=handler.next;
        }
        return dummy.next;
    }
}