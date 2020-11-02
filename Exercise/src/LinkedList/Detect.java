package LinkedList;

public class Detect {
    public Node detectCycle(Node head){
        Node fast=head;
        Node slow=head;

        do{
            if(fast==null){
                return null;
            }
            fast=fast.next;
            if(fast==null){
                return null;
            }
            fast=fast.next;
            slow=slow.next;
        }while(fast!=slow);

        Node p=head;
        Node q=slow;
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        return p;
    }
}
