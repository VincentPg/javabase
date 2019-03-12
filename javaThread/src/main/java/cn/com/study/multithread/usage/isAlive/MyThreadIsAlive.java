package cn.com.study.multithread.usage.isAlive;

/**
 * 测试当前的线程是否处于活动状态。
 * 线程活动状态：线程正在运行(已经启动或准备开始运行)且尚未终止
 */
public class MyThreadIsAlive extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThreadIsAlive:"+this.isAlive());
    }
}
