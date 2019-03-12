package cn.com.study.multithread.usage.currentThread;

import cn.com.study.multithread.usage.currentThread.MyCurrentThread;

/**
 * currentThread():返回代码段正在被哪个线程调用的信息。
 * Java多线程编程核心技术 --高洪岩 P16
 */
public class MyCurrentThreadTest {
    public static void main(String[] args) {
        //主线程main调用
        MyCurrentThread mythread = new MyCurrentThread();		//main方法调用
        //自建线程调用
        mythread.start();						                //自建线程调用
        //主线程main调用
        mythread.run();    						                //main方法调用
    }
}
