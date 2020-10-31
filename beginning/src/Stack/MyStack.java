package Stack;

public class MyStack<E> {
    private Object[] data;
    private int size;

    public MyStack(int capacity){
        if(capacity<=0){
            throw new IllegalArgumentException("栈的大小必须大于0");
        }
        data=new Object[capacity];
    }

    // 入栈
    public void push(E item){
        if(isFull()){
            throw new IllegalArgumentException("栈已经满了");
        }
        data[size++]=item;
    }

    // 出栈
    public E pop(){
        if(isEmpty()){
            throw new IllegalArgumentException("栈是空的");
        }
        E temp=(E)data[--size];
        data[size]=null;
        return temp;
    }

    public E peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("栈是空的");
        }
        return (E)data[size-1];
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public boolean isFull(){
        return size()==data.length;
    }

    public int size(){
        return size;
    }
}
