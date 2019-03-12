package cn.com.study.volatiles.nonAtom;

public class MyThread extends Thread {
    public volatile static int count;

    private static void addCount(){
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
