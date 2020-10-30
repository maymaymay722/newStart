package Queue;

public class MyShuQueue<E> {
    // 存储的元素
    private Object[] data;
    private int front;
    private int tail;

    public MyShuQueue(int numElements){
        data=new Object[numElements];
    }

    // 空间扩容，这里扩大一倍
    // 仅仅当满的时候才能触发扩容，此时 front 和 tail 都会指向同一个元素
    private void doubleCapacity(){
        int p=front;
        int n=data.length;   // 数组的长度
        int r=n-p;
        Object[] a=new Object[n<<1];   // 扩大一倍
        System.arraycopy(data,p,a,0,r);   // 先copy后面的 r 个
        System.arraycopy(data,0,a,r,p);    // 再 copy 前面的 p 个
        data=a;
        // 重新调整 front 和 tail 的值
        front=0;
        tail=n;
    }

    // 入队列
    public void addFirst(E e){
        // 添加到 front 的前面，所以 front-1
        front=(front-1+data.length)%data.length;
        data[front]=e;
        if(front==tail){   // 判断是否满了
            doubleCapacity();
        }
    }
    public void addLast(E e){
        data[tail]=e;
        tail=(tail+1)%data.length;
        if(tail==front){   // 判断是否满了
            doubleCapacity();
        }
    }

    // 出队列
    public E removeFirst(){
        if(isEmpty()){
            throw new IllegalStateException("队列是空的，无法移除......");
        }
        E result=(E)data[front];
        data[front]=null;
        // 删除第一个，默认为是 front 所指的，
        // 不是数组的 0 位置，然后在计算 front 的值。
        front=(front+1)%data.length;
        return result;
    }
    public E removeLast(){
        if(isEmpty()){
            throw new IllegalStateException("队列是空的，无法移除......");
        }
        tail=(tail-1+data.length)%data.length;
        E result=(E)data[tail];
        data[tail]=null;
        return result;
    }

    // 获取元素
    public E peekFirst(){
        if(isEmpty()){
            throw new IllegalStateException("队列是空的，无法获取......");
        }
        return (E)data[front];
    }
    public E peekLast(){
        if(isEmpty()){
            throw new IllegalStateException("队列是空的，无法获取......");
        }
        return (E)data[(tail-1+data.length)%data.length];
    }

    // 是否为空
    // 在上面添加元素的时候也可能 front=tail，
    // 当添加元素之后 front=tail 则就认为是满了，
    // 然后扩容，重新调整 front 和 tail 的值，
    // 所以扩容之后 front 就不可能等于 tail。
    // 如果没有触发上面添加元素的时候，front 等于 tail 就认为是空的。
    private boolean isEmpty() {
        return front==tail;
    }

    public int size(){
        return (tail-front+data.length)%data.length;
    }
}
