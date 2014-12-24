package 线程;

public class RunnableDemo1 implements Runnable {
	int ticket=10;
	int num=0;
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			if (ticket>0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"售出了"+
				num+"张票，还剩"+ticket+"张票");
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo1 r=new RunnableDemo1();
		Thread sr=new Thread(r);
		Thread sr1=new Thread(r);
		Thread sr2=new Thread(r);
		
		sr.setName("第一个售票窗口");
		sr1.setName("第二个售票窗口");
		sr2.setName("第三个售票窗口");
		
		sr.start();
		sr1.start();
		sr2.start();
		
//		new Thread(new RunnableDemo1()).getName();

	}

	
	

}
