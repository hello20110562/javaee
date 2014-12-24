package 线程;
/*
 * 1、实现了【线程任务和线程对象】的分离
 * 2、Runnable 【避免单继承限制】
 * 
 */
public class RunnableDemo implements Runnable {
	public int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RunnableDemo rd=new RunnableDemo();
		RunnableDemo rd1=new RunnableDemo();
		(new Thread(new RunnableDemo())).start();
		(new Thread(rd1)).start();
		
////		rd.run();
////		rd1.run();
//		Thread thread=new Thread(rd);//Thread (Runnable target) 构造方法
//		thread.start();
//		Thread thread1=new Thread(rd1);
//		thread1.start();
	}

//	private static void Thread(RunnableDemo rd) {
//		// TODO Auto-generated method stub
//		
//	}

}
