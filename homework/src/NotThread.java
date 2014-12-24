package 线程;
/*
 * main ------{}
 * Thread:线程类，线程有自己的任务，在定义线程类的时候，需要实现;?如run（）
 * 一、继承Thread类来创建
 * 1、继承
 * 2、复写run（）：任务   子类
 * 3、实例化：线程对象
 * 4、启动线程：start
 * 
 * 
 */
class Monkey extends Thread{//1\继承thread
	String name;
	public Monkey(String name) {
		super();
		this.name=name;
	}
	public void fight(){
		for (int i = 0; i < 11; i++) {
			System.out.println(name+"打败第"+i+"个天兵天将");
		}
	}
	public void run(){//复写run方法
		fight();
	}
}
public class NotThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m1=new Monkey("第一个孙悟空");//实例化对象
		Monkey m2=new Monkey("第二个孙悟空");
		Monkey m3=new Monkey("第三个孙悟空");
		m1.setName("线程一");//?
		m1.start();//启动线程
		m2.start();
		m3.start();
		System.out.println("=============");
		System.out.println(m1.getName());
	
	}

}
