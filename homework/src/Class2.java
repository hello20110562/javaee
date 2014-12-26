package 任务不同的多线程;

/* 	线程通信：等待--唤醒
 * 	wait：	释放锁、释放cpu==进入线程池
 * 	notify：	唤醒、
 * 	notifyAll
 * 使用同一个锁来调用方法==
 * 
 * 	3、产量==销量？
 * 					
 *					任意
 *	共享数据————————>锁————————————>锁.方法——————
 *			线程同步：数据安全 	线程间通信：协作	
 */

class Resource {
	int id;
	String name;	
	boolean flag=false;	//产品？
}

/*
 *  产线：产品是否卖出去了？ 再去确实是否开公继续生产？
 *  	有：	1、通知销售	2、不生产
 *  	无：	1、被告知	2、生产
 */
class Input1 implements Runnable {
	Resource r;

	// alt+shift +s
	public Input1(Resource r) {
		super();
		this.r = r;
	}

	int key = 0;

	@Override
	public void run() {
	

		while (true) {
			synchronized (r) {
				//1、产品？
				if (r.flag) {//停产、休息：线程释放cpu
					try {
						r.wait();	//
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//2、继续生产:
				switch (key++ % 3) {
				case 0:
					for (int i = 0; i < 10; i++) {
							r.id = 6666;
					r.name = "iphone6";
					System.out.println("生产第"+i+"iphone6");
					}
					break;
				case 1:
					for (int i = 0; i < 10; i++) {
						r.id = 7777;
						r.name = "iphone7";
						System.out.println("生产第"+i+"iphone7");
					}
				
					break;
				case 2:
					for (int i = 0; i < 10; i++) {
							r.id = 8888;
					r.name = "iphone8";
					System.out.println("生产第"+i+"iphone8");
					}
					break;
				default:
					break;
				}
				//3、有产品，通知销售
				r.flag = true;
				r.notify();	
			}
			
		
		}
	}
}

/*
 *  销售：是否有产品可卖？
 *  有：1、被产线告知		2、销售
 *  无：1、通知产线		2、休息：停止销售	
 */
class Output1 implements Runnable {
	Resource r;

	public Output1(Resource r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {		
				
		while (true) { //
			synchronized (r) {
				//1、产品？
				if (!r.flag) {	//没产品:
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//2、销售
				for (int i = 0; i < 10; i++) {
					System.out.println("卖了第"+i+"部"+ r.name + "\t id:" + r.id);
				}
				
				//3、完了
				r.flag = false;
				r.notify();		//通知
			}			
		}
		
		
		
	}
}

public class Class2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1、创建共享资源
		Resource r = new Resource();

		// 2、创建线程任务：run
		Input1 Input1 = new Input1(r);
		Output1 Output1 = new Output1(r);

		// 3、创建线程对象：
		Thread th_in = new Thread(Input1);
		Thread th_out = new Thread(Output1);

		// 4、开启
		th_in.start();
		th_out.start();
	}
}
