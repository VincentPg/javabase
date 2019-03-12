package cn.com.study.multithread.threadSafe.notshare;

/**
 * 线程不共享数据。
 * Java多线程编程核心技术 --高洪岩 P9
 *
 **/
public class Run {
	public static void main(String[] args) {
		//此处创建了三个线程对象，各自访问自己的实例变量count。  即一线程一份数据
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}
}
