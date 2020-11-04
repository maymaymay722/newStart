import javax.naming.ldap.ExtendedRequest;

// 通过继承Thread类创建线程类
public class ExtendsThread extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ExtendsThread().start();
        }
    }
}


