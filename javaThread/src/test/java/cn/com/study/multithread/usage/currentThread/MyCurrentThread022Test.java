package cn.com.study.multithread.usage.currentThread;

import cn.com.study.multithread.usage.currentThread.MyCurrentThread02;

public class MyCurrentThread022Test {
    public static void main(String[] args) {
        Thread myCurrentThread022 = new MyCurrentThread02();
        myCurrentThread022.setName("A");
        myCurrentThread022.start();
    }
}

/* 运行结果：
MyCurrentThread02---begin
Thread.currentThread().getName()=main
this.getName()=Thread-0
MyCurrentThread02---end

run---begin
Thread.currentThread().getName()=Thread-0
this.getName()=Thread-0
run---end
 */