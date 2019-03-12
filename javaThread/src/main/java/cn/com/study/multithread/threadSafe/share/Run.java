package cn.com.study.multithread.threadSafe.share;

/**
 * 线程共享数据：多个线程访问同一个变量。
 * 注意：
 * 	如果在线程类的线程方法体run()前加上关键字synchronized后结果会不一样。
 *
 * 非线程安全：多个线程对同一个对象中的同一个实例变量进行操作时会出现值被更改、值不同步的情况，
 * 进而影响程序的执行流程。
 *
 * Java多线程编程核心技术 --高洪岩 P10

 *
 **/
public class Run {
	public static void main(String[] args) {
		MyThread mythread=new MyThread();  // 一个线程对象
		//基于一个线程对象创建五个线程。
		Thread a=new Thread(mythread,"A");
		Thread b=new Thread(mythread,"B");
		Thread c=new Thread(mythread,"C");
		Thread d=new Thread(mythread,"D");
		Thread e=new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
/**
 * 不加synchronized 关键字可能的结果
 由 A 计算，count=3
 由 E 计算，count=0
 由 C 计算，count=1
 由 B 计算，count=3
 由 D 计算，count=1
 *  加synchronized 关键字可能的结果
 由 A 计算，count=4
 由 E 计算，count=3
 由 D 计算，count=2
 由 C 计算，count=1
 由 B 计算，count=0
 */