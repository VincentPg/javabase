package cn.com.study.lock.reentrantLock.wait_notify.moreconditionWaitNotify;


public class ThreadB extends Thread {

	private MyService service;

	public ThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}
}
