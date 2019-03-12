package cn.com.study.multithread.usage.currentThread;

import cn.com.study.multithread.usage.currentThread.MyCurrentThread02;

public class MyCurrentThread021Test {
    public static void main(String[] args) {
        MyCurrentThread02 myCurrentThread02 = new MyCurrentThread02();
        myCurrentThread02.setName("A");
        myCurrentThread02.start();
    }
}
/*
 执行结果：
MyCurrentThread02---begin
Thread.currentThread().getName()=main
this.getName()=Thread-0
MyCurrentThread02---end


run---begin
Thread.currentThread().getName()=A
this.getName()=A
run---end
 */