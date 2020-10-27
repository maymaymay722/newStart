package LinkedList;

// 定义 HeroNode，每个 HeroNode 对象就是一个结点
class HeroNode{
    int no;
    String name;      // 名字
    String nickName;  // 外号
    HeroNode next;    // 指向下一个结点

    // 构造器
    HeroNode(int no,String name,String nickName){
        this.no=no;
        this.name=name;
        this.nickName=nickName;
    }

    @Override
    public String toString(){
        return "HeroNode [ no="+no+", name="+name+", nickName="+nickName+" ]";
    }
}

// 定义 SingleLinkedList，管理我们的英雄
class SingleLinkedList{
    // 先初始化一个头结点，头结点不要动，不存放具体数据
    private HeroNode head=new HeroNode(0,"","");

    // 添加结点到单链表
    // 第一步：找到当前链表的最后结点
    // 第二步：将最后这个结点的 next 指向新的结点
    public void add(HeroNode heroNode){
        // 因为 head 结点不能动，因此需要一个辅助遍历 temp
        HeroNode temp=head;
        // 遍历链表，找到最后结点
        while(true){
            if(temp.next==null){
                break;
            }
            // 如果没有找到最后，将 temp 向后移动
            temp=temp.next;
        }
        // 当退出 while 循环时，temp 指向链表的最后
        // 将最后这个结点的 next 指向新的结点
        temp.next=heroNode;
    }

    // 根据结点的no，有序插入
    // 如果已经存在这个排名，则添加失败，并给出提示
    public void addByOrder(HeroNode heroNode){

    }

    // 显示链表（遍历）
    public void list(){
        // 判断链表是否为空
        if(head.next==null){
            System.out.println("链表为空！！！");
            return;
        }
        // 因为头结点不能动，因此我们需要一个辅助变量来遍历
        HeroNode temp=head.next;
        while(true){
            // 判断是否到链表最后，是则结束
            if(temp==null){
                break;
            }
            // 输出结点的信息
            System.out.println(temp);
            // 将 temp 后移
            temp=temp.next;
        }
    }
}

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        // 进行测试，先创建结点
        HeroNode node1=new HeroNode(1,"宋江","及时雨");
        HeroNode node2=new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode node3=new HeroNode(3,"吴用","智多星");
        HeroNode node4=new HeroNode(4,"林冲","豹子头");

        // 创建单链表
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        // 加入
        singleLinkedList.add(node1);
        singleLinkedList.add(node2);
        singleLinkedList.add(node3);
        singleLinkedList.add(node4);
        // 显示
        singleLinkedList.list();
    }
}
