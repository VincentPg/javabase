package cn.com.study.lock.reentrantLock.likeSyn02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();

	public void methodA() {
		try {
			//获取锁。
			lock.lock();
			System.out.println("methodA begin ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodA  end ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			//释放锁。
			lock.unlock();
		}
	}

	public void methodB() {
		try {
			//获取锁
			lock.lock();
			System.out.println("methodB begin ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodB  end ThreadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			//释放锁
			lock.unlock();
		}
	}

}