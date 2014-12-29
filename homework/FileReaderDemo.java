package 字节流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//文件输入流：文件必须存在，否则异常
		FileReader fr= new FileReader("new.txt");
		FileWriter fw=new FileWriter("p.txt");
		FileWriter fw1=new FileWriter("pp.txt");
		System.out.println(fr);
		

		//字符数组输出到终端
//		char[] ch=new char[1024];
//		int size=0;
//		System.out.println(ch);
//		while ((size=fr.read())!=-1) {
//			System.out.print((char)size);
//			fw1.write(size);
//			fw1.flush();
//		}
//		  fw1.close();

		
		//单个字符输出到终端：O.txt
		int ch1=0;
		while ((ch1=fr.read())!=-1) {
			System.out.println((char)ch1);
			fw.write(ch1);
			fw.flush();
		}
		 	fw.close();		
	}

}
