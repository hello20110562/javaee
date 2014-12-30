//this 指向调用该方法的对象 使用情况有两种：
//1、构造其中引用构造器正在初始化的对象
//2、在方法中调用方法的对象
 class Dog{
	public void jump(){
		System.out.println("正在执行jump方法");
	}
	public void run(){
		/* Dog d = new Dog();
		d.jump(); */
		this.jump();
		System.out.println("正在执行run方法");
	}
	
}
public class DogTest{
	public static void main(String [] args){
		//创建Dog的对象
		Dog dog =new Dog();
		//调用Dog对象的run方法
		dog.run();
		dog.jump();
	}

}