package cn.com.study.lock.reentrantLock.wait_notify.moreconditionWaitNotify;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitA();
	}
}
