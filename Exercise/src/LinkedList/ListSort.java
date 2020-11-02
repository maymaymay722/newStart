package LinkedList;

public class ListSort {
    public Node partition(Node pHead,int x){
        // val<x
        Node less=null;
        Node lessLast=null;
        // val>x
        Node gread=null;
        Node greadLast=null;

        Node cur=pHead;
        while(cur!=null){
            if(cur.val<x){
                if(less==null){
                    less=cur;
                }else{
                    lessLast.next=cur;
                }
                lessLast=cur;
            }else{
                if(gread==null){
                    gread=cur;
                }else{
                    greadLast.next=cur;
                }
                greadLast=cur;
            }
            cur=cur.next;
        }
        if(less==null){
            return gread;
        }else{
            lessLast.next=gread;
            if(greadLast!=null){
                greadLast.next=null;
            }
            return less;
        }
    }
}
