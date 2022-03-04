public ListNode deleteDuplicates(ListNode head) {
ListNode fakeHead = head;
while(fakeHead != null && fakeHead.next != null){
if(fakeHead.val == fakeHead.next.val){
fakeHead.next = fakeHead.next.next;
} else{
fakeHead = fakeHead.next;
}
}
return head;
}