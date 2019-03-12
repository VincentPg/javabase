package cn.com.study.synchronize.method.reentrant;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        MyService service = new MyService();
        service.service1();
    }
}
