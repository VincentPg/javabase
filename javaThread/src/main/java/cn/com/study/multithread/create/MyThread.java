package cn.com.study.multithread.create;

/**
 * 继承Thread，创建线程。
 * Java多线程编程核心技术 --高洪岩 P5
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("继承类Thread " + Thread.currentThread().getName());
    }
}
