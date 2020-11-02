package EXercise;

class ListNode{
    int val;
    ListNode next=null;

    public ListNode(int val){
        this.val=val;
    }
}
public class DeleteKNode {
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode pre=head;
        ListNode cur=head;
        for (int i = 0; i < n; i++) {
            cur=cur.next;
        }
        if(cur==null){
            return head;
        }
        while(cur.next!=null){
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=pre.next.next;
        return head;
    }
}
