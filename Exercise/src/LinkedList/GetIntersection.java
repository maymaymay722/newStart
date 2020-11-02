package LinkedList;

public class GetIntersection {
    // 先求出两个链表的长度
    public int getLength(Node head){
        int len=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            len++;
        }
        return len;
    }

    public Node getIntersectionNode(Node headA,Node headB){
        int lenA=getLength(headA);
        int lenB=getLength(headB);

        Node longer=headA;
        Node shorter=headB;
        int diff=lenA-lenB;
        if(lenA<lenB){
            longer=headB;
            shorter=headA;
            diff=lenB-lenA;
        }
        for (int i = 0; i < diff; i++) {
            longer=longer.next;
        }
        while(longer!=shorter){
            longer=longer.next;
            shorter=shorter.next;
        }
        return longer;
    }
}
