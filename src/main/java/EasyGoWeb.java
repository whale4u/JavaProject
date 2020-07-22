import org.apache.http.client.fluent.Request;


public class EasyGoWeb {
    public static void main(String[] args) throws Exception {
        Runnable th = new Runnable() {
            @Override
            public void run() {
                int t = 0;
                boolean isRunning = true;
                while (isRunning) {
                    String url = "http://113.108.70.111:52720/?id=t" + t;
                    try {
                        String str = Request.Get(url).execute().returnContent().asString();
                        System.out.print(String.format("%s : %04d : %s", Thread.currentThread().getName(), t, str));
                    } catch (Exception e) {
                        isRunning = false;
                        e.printStackTrace();
                    }
                    t++;
                }
            }
        };
        // 启动100个线程，请求上面的接口
        for (int i = 0; i < 100; i++) {
            new Thread(th).start();
        }
        Thread.sleep(1000 * 30);
    }
}