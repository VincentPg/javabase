package cn.com.study.synchronize.method.reentrant;

public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
