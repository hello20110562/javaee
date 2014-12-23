import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class Student implements Comparable{
	private int sNo;
	private  String sName;
	private String sSex;
	private int sAge;
	private int sJava;
	
	public Student(){
		super();
	}
	//定义Student的构造函数
	public Student(int sNo, String sName, String sSex, int sAge, int sJava) {
		//System.out.println(this.sNo+this.sName+this.sSex+this.sAge+this.sJava);
		super();
		this.sNo=sNo;
		this.sName=sName;
		this.sSex=sSex;
		this.sAge=sAge;
		this.sJava=sJava;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNon(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public int getsJava() {
		return sJava;
	}
	public void setsJava(int sJava) {
		this.sJava = sJava;
	}
	public String toString(){//返回学生的信息
		return sNo+"\t"+sName+"\t"+sAge+"\t"+sSex+"\t"+sJava;
		
	}
	@Override
	public int compareTo(Object o) {//实现comparable接口的方法，按照Java成绩排序
		Student s1=(Student) o;
		int res=this.sJava-s1.sJava;
		return res;
	}
//	public double aver(){
//		double sum=0;
//		for (int i = 0; i < ; i++) {
//			
//		}
//		
//		return sum;
//	}
	
	

	}

	
