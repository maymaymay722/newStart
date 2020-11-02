package LinkedList;


public class DeleteSameNode {
    public Node deleteDuplicated(Node head){
        if(head==null){
            return head;
        }
        Node prev=null;
        Node p1=head;
        Node p2=head.next;

        while(p2!=null){
            if(p1.val!=p2.val){
                prev=p1;
                p1=p2;
                p2=p2.next;
            }else{
                while(p2!=null && p2.val==p1.val){
                    p2=p2.next;
                }
                // 此时 p1.val != p2.val
                if(prev==null){
                    head=p2;
                }else{
                    prev.next=p2;
                }
                p1=p2;
                if(p2!=null){
                    p2=p2.next;
                }
            }
        }
        return head;
    }
}
