package Queue;

public class MyQueue<E> {
    private final Object[] data;
    private final int maxSize;
    private int size;
    private int front=0;
    private int tail=0;

    public MyQueue(int maxSize){
        if(maxSize<=0){
            throw new IllegalArgumentException("队列容量必须大于0："+maxSize);
        }
        this.maxSize=maxSize;
        data=new Object[this.maxSize];
    }

    // 入队列
    // 每添加一个元素tail加1
    public void add(E e){
        if(isFull()){
            // 可以扩容 或者 抛异常
            throw new IllegalStateException("队列已经满了，无法再加入......");
        }
        data[tail++]=e;
        size++;
    }

    // 出队列
    // 每删除一个元素front加1
    public E remove(){
        if(isEmpty()){
            throw new IllegalStateException("队列是空的，无法移除......");
        }
        E t=(E)data[front];
        data[front++]=null;
        size--;
        return t;
    }

    // 队列头和队列尾指向同一空间的时候，并且没到队尾，表示队列是空的
    public boolean isEmpty(){
        return front==tail && !isFull();
    }

    public boolean isFull(){
        // 最后一个位置不是存储数据的
        return tail==maxSize-1;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(10);
        System.out.println("isEmpty()="+myQueue.isEmpty());
        System.out.println("isFull()="+myQueue.isFull());
        System.out.println("getSize()="+myQueue.getSize());
        for (int i = 0; i < 9; i++) {
            myQueue.add(i*100);
            myQueue.remove();
        }
        System.out.println("------------------------------");
        System.out.println("isEmpty()="+myQueue.isEmpty());
        System.out.println("isFull()="+myQueue.isFull());
        System.out.println("getSize()="+myQueue.getSize());
    }
}
