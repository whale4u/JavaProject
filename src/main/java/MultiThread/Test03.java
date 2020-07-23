package MultiThread;

public class Test03 {
    public static void main(String[] args) {
        MyThread03 myThread03 = new MyThread03();
        Thread a = new Thread(myThread03, "A");
        Thread b = new Thread(myThread03, "B");
        Thread c = new Thread(myThread03, "C");
        Thread d = new Thread(myThread03, "D");
        Thread e = new Thread(myThread03, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
