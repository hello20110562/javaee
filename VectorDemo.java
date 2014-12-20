package b_List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		for(int i =0; i < 5; i++){
			v.addElement("it-" + i);
		}
		System.out.println(v);
		
		
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String object = (String) en.nextElement();
			System.out.println(object);
		}
		
		for(en=v.elements(); en.hasMoreElements();){
			System.out.println(en.nextElement());
		}
		
	}

}
