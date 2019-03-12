package cn.com.study.multithread.usage.isAlive;

public class MyThreadIsAlive02  extends Thread{

    public MyThreadIsAlive02(){
        System.out.println("MyThreadIsAlive02---begin");

        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("MyThreadIsAlive02---end");
    }

    public  void run(){
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+ Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()="+this.isAlive());

        System.out.println("run---end");
    }
}
