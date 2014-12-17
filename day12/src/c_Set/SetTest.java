//set 不包含重复元素，且可以直接访问元素  接口
//实现多种类型元素的存储
package c_Set;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//import java.util.TreeSet;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set =new LinkedHashSet();//实现类与数据存储之间有关  实现类
		set.add("壹");
		set.add("贰");
		set.add("叁");
		set.add("1");
		
		System.out.println(set.hashCode());
		System.out.println(set);
		System.out.println("set是否为空："+set.isEmpty());
		System.out.println("set是否包括贰"+set.contains("贰"));
		
		
		System.out.println(set.size());
		
		System.out.println(set.toArray());
		
		
		
		//遍历： 逐个输出集合元素
		//方法一：
		//for(Iterator it=set.iterator();it.hasNext();){
			//Object object=(Object)it.next();
			//System.out.println("数据迭代是"+object);
		//}
		
		
		//方法二：
		Iterator itt =set.iterator();
		while (itt.hasNext()) {
			Object bject = (Object) itt.next();
			System.out.println("数据迭代是"+bject);		
		}
	}

}
