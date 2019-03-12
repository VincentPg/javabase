package cn.com.study.multithread.usage.currentThread;

import cn.com.study.multithread.usage.currentThread.MyCurrentThread02;

/**
 * 比较线程创建的不同方式对Thread.currentThread().getName() 和this.getName()的影响
 *
 *
 * Java多线程编程核心技术 --高洪岩 P17
 */
public class MyCurrentThread02Test {
    public static void main(String[] args) {
        MyCurrentThread02 c = new MyCurrentThread02();
        Thread t1 = new Thread(c);
        System.out.println("MyCurrentThread02Test1:"+c.getName());
        t1.setName("A");
        t1.start();

    }

    /** 执行结果如下：
     MyCurrentThread02---begin
     Thread.currentThread().getName()=main       //主线程调用构造器创建实例，所以必须是main
     this.getName()=Thread-0                     //此时没有启动MyCurrentThread02子线程，this代表的是MyCurrentThread02的对象实例。
     MyCurrentThread02---end

     MyCurrentThread02Test1:Thread-0

     run---begin
     Thread.currentThread().getName()=A
     this.getName()=Thread-0
     run---end
     *
     *
     */


    /*
    代码：
    MyCurrentThread02 myCurrentThread02 = new MyCurrentThread02();
    myCurrentThread02.start();

    执行结果：
    MyCurrentThread02---begin
    Thread.currentThread().getName()=main   //主线程调用构造器创建实例，所以必须是main
    this.getName()=Thread-0                 //此时没有启动MyCurrentThread02子线程，this代表的是MyCurrentThread02的对象实例。
    MyCurrentThread02---end


    run---begin
    Thread.currentThread().getName()=A
    this.getName()=A
    run---end
 */
  /*
  代码：
  Thread myCurrentThread022 = new MyCurrentThread02();
  myCurrentThread022.start();

  运行结果：
    MyCurrentThread02---begin
    Thread.currentThread().getName()=main   //主线程调用构造器创建实例，所以必须是main
    this.getName()=Thread-0                 //此时没有启动MyCurrentThread02子线程，this代表的是MyCurrentThread02的对象实例。
    MyCurrentThread02---end

    run---begin
    Thread.currentThread().getName()=A
    this.getName()=A
    run---end
  */


}
