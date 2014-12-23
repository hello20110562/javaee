package set_day_14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable{//创建学生类
	String name;
	int scores;
	/**
	 * @param args
	 */
	public Student(String name,int scores) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.scores=scores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		int res=this.scores-s.scores;
		return res==0?this.name.compareTo(s.name):res;
	}
	
	public String toString(){
		return "姓名：\t"+name+"\t"+scores;
	}

}

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Set set=new TreeSet();
	  
	  set.add(new Student("张三丰",69));
	  set.add(new Student("周杰",77));
	  set.add(new Student("周杰伦",86));
	  set.add(new Student("周学农",78));
	  set.add(new Student("韦小宝",59));
	  
	  Iterator it=set.iterator();
	  while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
	}
	}

}
