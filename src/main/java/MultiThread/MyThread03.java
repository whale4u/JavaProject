package MultiThread;

//ʹ��synchronized�̹߳���

public class MyThread03 extends Thread {
    private int count =5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("�� "+ currentThread().getName() + " ����, count="+ count);
    }
}
