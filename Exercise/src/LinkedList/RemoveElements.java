package LinkedList;

public class RemoveElements {
    public Node removeElements(Node head,int val){
        Node prev=null;
        Node cur=head;

        while(cur != null){
            if(cur.val==val){
                if(cur==head){
                    head=cur.next;
                }else{
                    prev.next=cur.next;
                }
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}
