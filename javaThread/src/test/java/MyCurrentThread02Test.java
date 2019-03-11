import cn.com.study.multithread.usage.currentThread.MyCurrentThread02;

/**
 * Java多线程编程核心技术 --高洪岩 P17
 */
public class MyCurrentThread02Test {
    public static void main(String[] args) {
        MyCurrentThread02 c = new MyCurrentThread02();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }

    /** 执行结果如下：
     * MyCurrentThread02---begin
     * Thread.currentThread().getName()=main
     * this.getName()=Thread-0
     * MyCurrentThread02---end
     *
     * run---begin
     * Thread.currentThread().getName()=A
     * this.getName()=Thread-0
     * run---end
     *
     *
     */
}
