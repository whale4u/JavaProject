package MultiThread;

public class MyThread02 extends Thread{
    private int i;
    public MyThread02(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
