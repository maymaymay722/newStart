package LinkedList;

public class MergeLists {
    public Node mergeTwoLists(Node list1,Node list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        Node prehead=new Node(-1);
        Node prev=prehead;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                prev.next=list1;
                list1=list1.next;
            }else{
                prev.next=list2;
                list2=list2.next;
            }
            prev=prev.next;
        }
        prev.next=list1==null?list2:list1;
        return prehead.next;

        /*Node result=null;
        Node last=null;
        Node cur1=list1;
        Node cur2=list2;

        while(cur1 != null && cur2!=null){
            if(cur1.val<=cur2.val){
                Node next=cur1.next;
                if(result==null){
                    result=cur1;
                }else{
                    last.next=cur1;
                }
                last=cur1;

                cur1=next;
            }else{
                Node next=cur2.next;
                if(result==null){
                    result=cur2;
                }else{
                    last.next=cur2;
                    cur2=next;
                }
            }
        }
        if(cur1!=null){
            last.next=cur1;
        }else{
            last.next=cur2;
        }
        return result;*/

        // 递归
        /*if(list1.val<=list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }*/
    }
}
