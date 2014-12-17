package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *List:存储各种数据，元素可以重复，有序【可以使用索引访问元素】
		 * 相对Collection：特有方法：带索引index的方法
		 */
		List list = new ArrayList();
		List list2=new ArrayList();
		
		
		//1、增操作
		list.add("Android-001");
		list.add("Android-002");
		list.add("Android-003");
		list.add("Android-004");
		list.add("Android-005");
		
		list2.add("sunwukong");
		//list.add(arg0, arg1)  插入元素
		list.add(3, "Google");
		
		//list.addAll(arg0)  添加另一列表
		list.addAll(list2);
		
		for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
		}
		try{
		System.out.println(list.remove(10));// 溢出异常
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("caozuosu");
		}
		System.out.println(list.remove("Android-111"));
		
		
		System.out.println("-------+------");
		//替换 修改
		list.set(0, "TRA");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("+++++++");
		//遍历
		//for(Iterator it=list.iterator();it.hasNext();){
			//Object object=(Object) it.next();
			//System.out.println(object);
		//}
		//选择从某个位置开始
		for(Iterator it=list.listIterator(2);it.hasNext();){
			Object object=(Object) it.next();
			System.out.println(object);
		}
		System.out.println(list.size());
		
		//ListIterator:
		
		ListIterator itt =list.listIterator();
		//for(){
			
		//}
		
		
	}

}
