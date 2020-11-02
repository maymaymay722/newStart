package Thread;
/*
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("这里是线程运行的代码");
    }
}
public class ThreadDemo{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
*/

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"这里是线程运行的代码");
    }
}
public class ThreadDemo{
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable());
        t.start();
    }
}

// 饿汉模式
/*
class Singleton{
    // 类加载时初始化单例，以后访问时直接返回即可
    private static Singleton instance=new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return instance;
    }
}
*/

// 懒汉模式
/*
class Singleton{
    // 先不初始化单例，等第一使用的时候再初始化
    private static Singleton instance=null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
*/

// 多线程版本
class Singleton{
    private volatile static Singleton instance=null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}