package LinkedList;

public class PalindromeList {
    // 找中间结点
    public Node getMid(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null){
            fast=fast.next;
            if(fast==null){
                break;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    // 逆置
    public Node reverse(Node head){
        Node result=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=result;
            result=cur;
            cur=cur.next;
        }
        return result;
    }

    // 判断回文
    public boolean chkPalindrome(Node head){
        Node mid=getMid(head);
        Node h2=reverse(mid);
        Node n1=head;
        Node n2=h2;

        while(n1!=null && n2!=null){
            if(n1.val!=n2.val){
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return true;
    }
}
