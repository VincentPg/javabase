package cn.com.study.synchronize.method.reentrant;

public class MyService {
    public synchronized void service1(){
        System.out.println("MyService.service1");
        service2();
    }
    public synchronized void service2(){
        System.out.println("MyService.service2");
        service3();
    }

    public synchronized  void service3(){
        System.out.println("MyService.service3");

    }
}
