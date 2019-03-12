package cn.com.study.volatiles.nonAtom;


public class MyThread2  extends Thread {
    public volatile static int count;

    private synchronized static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("MyThread.addCount:"+count);
    }
    @Override
    public void run() {
        super.run();
        addCount();
    }
}
