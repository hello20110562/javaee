//this ָ����ø÷����Ķ��� ʹ����������֣�
//1�������������ù��������ڳ�ʼ���Ķ���
//2���ڷ����е��÷����Ķ���
 class Dog{
	public void jump(){
		System.out.println("����ִ��jump����");
	}
	public void run(){
		/* Dog d = new Dog();
		d.jump(); */
		this.jump();
		System.out.println("����ִ��run����");
	}
	
}
public class DogTest{
	public static void main(String [] args){
		//����Dog�Ķ���
		Dog dog =new Dog();
		//����Dog�����run����
		dog.run();
		dog.jump();
	}

}