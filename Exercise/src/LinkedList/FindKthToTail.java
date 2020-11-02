package LinkedList;

public class FindKthToTail {
    public Node findKth(Node head, int k){
        int len=getLength(head);
        if(len<k){
            return null;
        }
        int steps=len-k;
        Node result=null;
        for (int i = 0; i < steps; i++) {
            result=result.next;
        }
        return result;
    }
    private int getLength(Node head){
        int len=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            len++;
        }
        return len;
    }
}
