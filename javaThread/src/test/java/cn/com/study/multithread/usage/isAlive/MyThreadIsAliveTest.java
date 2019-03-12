package cn.com.study.multithread.usage.isAlive;

import cn.com.study.multithread.usage.isAlive.MyThreadIsAlive;

/**
 *
 */
public class MyThreadIsAliveTest {
    public static void main(String[] args) {
        MyThreadIsAlive myThreadIsAlive = new MyThreadIsAlive();
        //线程未启动，所以不处于存活状态。
        System.out.println("begin =="+myThreadIsAlive.isAlive());
        //启动线程
        myThreadIsAlive.start();
        //如果此行代码和上述代码相差时间比较长，即在线程结束后执行。则为false，反之为true
        System.out.println("end==" + myThreadIsAlive.isAlive());
    }
}
