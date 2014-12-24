package 线程;

public class ThreadDemo1 extends Thread {
	static int ticket=10;//当前共有票数
	int num =0;//当前售出票数
	
	public void run(){
		for (int i = 1; i <=10; i++) {
			if(ticket>0){
				ticket--;
				num++;
				System.out.println(getName()
						+"售出了"+num+"张票，还剩"+ticket+"张票");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t1=new ThreadDemo1();
		ThreadDemo1 t2=new ThreadDemo1();
		
		t1.setName("第一个售票窗口");
		t2.setName("第二个售票窗口");
		
		t1.start();
		t2.start();
	}

}
