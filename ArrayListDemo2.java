package b_List;

import java.util.ArrayList;

import bean.Person;

public class ArrayListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			al.add(new Person(i, "it-"+i));
		}
		Person p = new Person(3, "it-3");
		al.add(p);			
		System.out.println(al);
		System.out.println(al.indexOf(p) + "==" + al.lastIndexOf(p));
		System.out.println(al.indexOf(new Person(3, "it-3")) + "====" + al.lastIndexOf(new Person(3, "it-3")));
	}

}
