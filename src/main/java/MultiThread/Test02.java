package MultiThread;

public class Test02 {
    public static void main(String[] args) {
        MyThread02 t1 = new MyThread02(1);
        MyThread02 t2 = new MyThread02(2);
        MyThread02 t3 = new MyThread02(3);
        MyThread02 t4 = new MyThread02(4);
        MyThread02 t5 = new MyThread02(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
