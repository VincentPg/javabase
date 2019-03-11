import cn.com.study.multithread.create.MyThread;

/**
 * 注意观察执行结果和代码顺序不一致。
 *  线程调用的随机性。
 *
 *
 */
public class MyThread01Test {
    public static void main(String[] args) {
        //创建子线程
        MyThread myThread01 = new MyThread();
        myThread01.start();
        System.out.println("主线程"+Thread.currentThread().getName()+"运行结束！");
    }
}
