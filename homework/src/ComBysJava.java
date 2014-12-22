import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class ComBysJava implements Comparator {

	private double ave;
	double sum=0;
	public int compare(Object o1,Object o2) {
		Student st1=(Student) o1;
		Student st2= (Student) o2;
		int res=st1.getsJava()-st2.getsJava();
		return res;
	}
	TreeSet set=new TreeSet<>();
	Student student= new Student();
	public double aver(Object o){ 
		for (int i = 0; i < set.size(); i++) {
			double db=(double)student.getsJava();
			sum=sum+(double)db;
			System.out.println("++++++++++");
		}
		return 0;
		
	}
}
