public class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedDemo demo=new SynchronizedDemo();
        demo.method();
    }

    private void method() {
        // 进入代码块会锁 SynchronizedDemo.class 指向对象的锁
        // 出代码块会释放 SynchronizedDemo.class 指向对象的锁
        synchronized(SynchronizedDemo.class){

        }
    }
}
