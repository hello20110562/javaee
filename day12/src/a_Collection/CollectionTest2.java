package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection list1=new ArrayList();
		
		List list = new ArrayList();
		list.add("孙悟空");
		list.add("猪八戒");
		list.add("沙僧");
		System.out.println("西游人物有"+list);
		
		list.add(1, 500);
		list.add(3, 50);
		list.add(5, 300);
		
		
		System.out.println("他们的战斗力"+list);
		System.out.println("list集合是否包括“孙悟空”："+list.contains("孙悟空"));
		System.out.println("list集合元素数："+list.size());
		//c.remove(50);
	//	System.out.println("移动后"+c);
		
		
	    
		//c.addAll(co);
		//System.out.println(c);
		
		//c.retainAll(co);
		//System.out.println("tamen "+c.removeAll(co));
	
	}

}
