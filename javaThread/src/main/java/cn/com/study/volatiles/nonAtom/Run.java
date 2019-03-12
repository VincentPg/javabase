package cn.com.study.volatiles.nonAtom;

public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
/*
  MyThread执行结果：

  MyThread2执行结果：
    MyThread.addCount:10
    MyThread.addCount:20
    MyThread.addCount:30
    MyThread.addCount:40
    MyThread.addCount:50
    MyThread.addCount:60
    MyThread.addCount:70
    MyThread.addCount:80
    MyThread.addCount:90
    MyThread.addCount:100
 */