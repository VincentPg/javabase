package cn.com.study.synchronize.method.extendLock;

public class Sub extends  Main {
    public void serviceMethod(){
        try {
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName()
                    + "time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName()
                    + "time=" + System.currentTimeMillis());
            super.serviceMethod();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
