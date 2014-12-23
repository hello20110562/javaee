package day_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Counter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="13913535174";
		HashMap h=new HashMap();
		for (int i = 0; i < content.length(); i++) {
			char c=content.charAt(i);
			Integer num=(Integer)h.get(c);
			if (num==null) 
				num=0;
				h.put(c, num+1);
		}
			System.out.println(h);
			Set entrys=h.entrySet();
			for (Iterator iterator = entrys.iterator(); iterator.hasNext();)
			{
				Map.Entry object = (Map.Entry) iterator.next();
				System.out.println(object.getKey()+":"+object.getValue());
			}
		}
	}


