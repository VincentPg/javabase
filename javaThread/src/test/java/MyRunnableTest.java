import cn.com.study.multithread.create.MyRunnable;

public class MyRunnableTest {
    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("主线程"+Thread.currentThread().getName()+"运行结束！");
    }
}
