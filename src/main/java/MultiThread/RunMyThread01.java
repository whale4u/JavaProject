package MultiThread;

import MultiThread.MyThread01;

public class RunMyThread01 {
    public static void main(String[] args) {
        MyThread01 myThread = new MyThread01();
        myThread.start();
        System.out.println("Finished!");
    }
}
