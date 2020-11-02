package LinkedList;

public class MidNode {
    private int getLength(Node head){
        int len=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            len++;
        }
        return len;
    }

    public Node middleNode(Node head){
        int len=getLength(head);
        int middle=len/2;
        Node node=head;
        for (int i = 0; i < middle; i++) {
            node=node.next;
        }
        return node;
    }
}
