class Address{
	String detail;
	public Address(String detail){
		this.detail = detail;
	}
}
class User implements Cloneable{
	int age;
	Address address;
	public User(int age){
		this.age = age;
		address = new Address("�������");
	}
	public User clone()
	throws CloneNotSupportedException
	{
	
		return (User)super.clone();
	}
}
public class CloneTest{
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		User u1= new User(23);
		//clone �õ�u1�ĸ���
		User u2 = u1.clone();
		System.out.println(u1 == u2);
		//�ж�u1,u2�Ƿ���ͬ
		System.out.println(u1.address == u2.address);
		//�ж�u1,u2��address�Ƿ���ͬ
	}

}
