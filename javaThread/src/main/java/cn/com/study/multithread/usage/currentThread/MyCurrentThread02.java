package cn.com.study.multithread.usage.currentThread;

/**
 * Thread.currentThread().getName() 和this.getName()的区别：
 *  见测试用例：
 *      MyCurrentThread02Test
 *      MyCurrentThread021Test
 *      MyCurrentThread022Test
 *
 * Java多线程编程核心技术 --高洪岩 P17
 */
public class MyCurrentThread02 extends  Thread {
    public MyCurrentThread02() {
        System.out.println("MyCurrentThread02---begin");

        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("MyCurrentThread02---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+ Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());

        System.out.println("run---end");
    }
}
