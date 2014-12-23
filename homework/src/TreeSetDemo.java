package treesetdemo;

import java.util.Iterator;
import java.util.TreeSet;

import javax.management.RuntimeErrorException;

public class TreeSetDemo {
	/*
	 * set :无序，不可重复元素
	 * 	|--HashSet 数据结构是哈希表，线程是非同步的
	 * 				保证元素唯一性的原理，判断元素的hashcode值是否相等
	 * 				如果相同，还会继续判断元素的equals方法，是否为true
	 	|TreeSet	可以对set集合中的元素进行排序
	 	 记住：排序时，当主要条件相同时，一定要判断下一次条件
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(new Student("zhang",25));
		ts.add(new Student("lilia",22));
	
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			//Student s=(Student)it.next();
			System.out.println(it.next());
			
		}
	}

}
class Student implements Comparable{//该接口强制让学生具备比较性。
	String name;
	private int age;
	Student(String name,int age){
		this.name =name;
		this.age=age;
	}
	public  String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Student))
		{
		throw new RuntimeErrorException(null, "不是学生对象");
		}
		else {
			Student s=(Student)o;
			if (this.age==s.age)
				{
					return 0;
				}else
					{
						// TODO Auto-generated method stub
						int res=this.age-s.age;
						return res==0?this.getName().compareTo(s.getName()):res;	
					}	
			}
		}
	public String toString(){
		return name+"\t"+age;
	}
}
