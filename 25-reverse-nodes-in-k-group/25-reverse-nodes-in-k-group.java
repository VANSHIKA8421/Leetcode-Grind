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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head==null || head.next==null || k==1 )
        {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode beforeStart = dummy; 
        ListNode end = head;
        int i = 0;
        while(end!=null)
        {
            i++;
            if(i%k==0)
            {
                ListNode start = beforeStart.next;
                ListNode temp = end.next;
                rev(start,end);
                beforeStart.next = end;
                start.next=temp;
                beforeStart=start;
                end=temp;
                 
            }
            else
            {
                end=end.next;
            }
        }
        return dummy.next;
    }
    void rev(ListNode start, ListNode end)
    {
        ListNode p = null;
        ListNode c = start;
        ListNode nex = start.next;
        while(p!=end)
        {
            c.next=p;
            p=c;
            c=nex;
            if(nex!=null) nex=nex.next;
        }
    }
}