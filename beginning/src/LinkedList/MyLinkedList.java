package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }

    public String toString(){
        return String.format("LinkedList.Node(%d)",val);
    }
}

public class MyLinkedList {
    // 尾插
    private static Node pushBack(Node head,int val){
        Node node=new Node(val);
        if(head==null){
            return node;
        }else{
            Node last=head;
            while(last.next != null){
                last=last.next;
            }
            last.next=node;
            return head;
        }
    }

    // 头插
    private static Node pushFront(Node head,int val){
        // 1.结点
        Node node=new Node(val);
        // 2.让原来的 head 成为 node 的下一个结点
        node.next=head;
        // 3.更新第一个结点的引用
        return node;
    }

    // 中间插入
    private static void pushAfter(Node pos,int val){
        Node node=new Node(val);
        node.next=pos.next;
        pos.next=node;
    }

    // 头删
    private static Node popFront(Node head){
        if(head==null){
            System.out.println("空链表无法删除！！！");
            return null;
        }
        // 第一个结点，会因为没有引用指向而被回收
        return head.next;
    }

    // 尾删
    private static Node popBack(Node head){
        if(head==null){
            System.out.println("空链表无法删除！！！");
            return null;
        }
        if(head.next==null){
            return null;
        }else {
            Node lastSecond=head;
            while(lastSecond.next.next==null){
                lastSecond=lastSecond.next;
            }
            lastSecond.next=null;
            return head;
        }
    }

    // 中间删除
    private void popAfter(Node pos){
        pos.next=pos.next.next;
    }
}



