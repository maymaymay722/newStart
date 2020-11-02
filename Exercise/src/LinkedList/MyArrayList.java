package LinkedList;

public class MyArrayList {
    private int[] array;
    private int size;

    public MyArrayList() {
        // 申请空间
        array=new int[2];
        // 初始化数据个数
        size=0;
    }

    // 保证容量够用，否则进行扩容
    private void ensureCapacity() {
        if(array.length>size){
            return;
        }

        int newCapacity=array.length*2;
        int[] newArray=new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }

    // 增
    public void pushBack(int element) {      //尾插
        ensureCapacity();
        array[size++] = element;
    }

    public void pushFront(int element) {      //头插
        ensureCapacity();
        for (int i = size; i >= 1; i--) {
            array[i]=array[i-1];
        }
        array[0]=element;
        size++;
    }

    public void insert(int index, int element) {  //中间插入
        if(index<0 || index>size){
            System.out.println("下标错误");
            return;
        }

        ensureCapacity();

        for (int i = size-1; i >= index; i++) {
            array[i+1]=array[i];
        }
        array[index]=element;
        size++;
    }

    // 删
    public void popBack() {           //尾删
        if(size<=0){
            System.out.println("顺序表为空");
            return;
        }
        array[--size]=0;
    }

    public void popFront() {          //头删
        if(size<=0){
            System.out.println("顺序表为空");
            return;
        }

        for (int i = 0; i < size-1; i++) {
            array[i]=array[i+1];
        }
        array[--size]=0;
    }

    public void earse(int index) {    //中间删除
        if(size<=0){
            System.out.println("顺序表为空");
            return;
        }
        if(index<0 || index>=size){
            System.out.println("下标错误");
            return;
        }
        for (int i = index+1; i < size; i++) {
            array[i-1]=array[i];
        }
        array[--size]=0;
    }

    // 打印
    public void print() {
        System.out.println("打印顺序表: 当前容量: " + array.length);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //查
    // 返回 element 在顺序表中的下标，如果出现多次，返回第一次出现的下标
    public int indexOf(int element) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.err.println("下标错误");
            return -1;
        }
        return array[index];
    }

    //改
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.err.println("下标错误");
            return;
        }
        array[index]=element;
    }

    // 删除掉某一个元素，如果出现多次，删除第一次出现的
    public void remove(int element) {
        int index = indexOf(element);
        if (index != -1) {
            earse(index);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //删除掉某一个元素，如果出现多次，删除全部
    public void removeAll(int element) {
		/* 时间:O(n^2)	时间：O(1)
		int index;
		while ((index = indexOf(element)) != -1) {
			earse(index);
		}
		*/

		/* 时间: O(n)	空间: O(n)
		int[] newArray = new int[array.length];
		int j = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] != element) {
				newArray[j++] = array[i];
			}
		}
		array = newArray;
		size = j;
		*/

        // 时间：O(n)	空间：O(1)
        int j=0;
        for (int i = 0; i < size; i++) {
            if(array[i]!=element){
                array[j++]=array[i];
            }
        }
        size=j;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.print();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.print();	// 1 2 3
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        list.print();	// 30 20 10 1 2 3
        list.insert(3, 100);
        list.print();	// 30 20 10 100 1 2 3
        list.insert(20, 200);	// 报错

        list.earse(2);
        list.earse(2);
        list.print();	// 30 20 1 2 3
        list.popFront();
        list.popFront();
        list.popFront();
        list.print();	// 2 3
        list.popBack();
        list.popBack();
        list.print();	// 空的
        list.popBack();	// 报错
    }
}
