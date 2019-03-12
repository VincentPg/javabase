package cn.com.study.synchronize.method.extendLock;

public class Main {
    public synchronized  void serviceMethod(){
        try {
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName()
                    + "time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName()
                    + "time=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
