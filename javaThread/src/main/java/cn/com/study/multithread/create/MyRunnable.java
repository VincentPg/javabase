package cn.com.study.multithread.create;

/**
 * 实现接口Runnable。
 * 如果准备创建的线程类已经继承了其它类，那么则需要Runnable接口。
 * Java多实现解决java单继承的问题，实现多继承的效果。
 *
 * Java多线程编程核心技术 --高洪岩 P8
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现接口Runnable "+Thread.currentThread().getName()+"运行中!");
    }
}
