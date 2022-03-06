if( null==headA || null==headB )
return null;
ListNode curA = headA, curB = headB;
while( curA!=curB){
curA = curA==null?headB:curA.next;
curB = curB==null?headA:curB.next;
}
return curA;
ListNode t1 = new ListNode();
t1 = headA;
ListNode t2 = new ListNode();
t2 = headB;
if(t1==null || t2==null) return null;
while(t1!=t2)
{
if(t1==null)
{
t1=t2;
}
else if(t2==null)
{
t2=t1;
}
t1=t1.next;
t2=t2.next;
}
return t1;