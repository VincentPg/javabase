package cn.com.study.multithread.usage.currentThread;

/**
 * Thread.currentThread():返回代码段正在被哪个线程调用的信息。
 * Java多线程编程核心技术 --高洪岩 P16
 */
public class MyCurrentThread extends Thread {
    public MyCurrentThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
