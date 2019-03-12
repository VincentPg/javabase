package cn.com.study.lock.reentrantLock.likeSyn01;

/**
 *  当前线程打印完毕后将锁进行释放，其他线程才可以继续打印。
 *  线程打印的数据是分组打印，因为当前线程已经持有锁，但线程之间打印的顺序时随机的。
 */
public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		MyThread a4 = new MyThread(service);
		MyThread a5 = new MyThread(service);

		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();

	}

}
