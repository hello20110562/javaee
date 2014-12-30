package 写入txt文本;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample{
	
	public static void main(String [] args) throws IOException{
		File file=new File(".");
		FileWriter fw=new FileWriter("bi.txt",true);
		fw.write("春潮带雨晚来急，野渡无人舟自横");
		fw.close();
		
		FileReader fr= new FileReader("bi.txt");
		char []ch=new char[33];
		int size=0;
		while ((size=fr.read(ch))!=-1) {
			System.out.println(new String(ch, 0, size));
		}
	}
}
//import java.io.*;
//public class WriteFileExample
//{
//	public static void main(String[] args) 
//	{
//	
//		try
//		{
//		File aFile=new File("WriteExample.txt");//指定文件名
//		//建立输出流
//		@SuppressWarnings("resource")
//		FileOutputStream out= new FileOutputStream(aFile);					
//		byte[] b=new byte[1024];
//			String str="This is a test file";
//			b=str.getBytes();//进行String到byte[]的转化
//			out.write(b);	//写入文本内容
//		}
//		catch (IOException e)
//		{
//			System.out.println(e.toString()+"hahahah");
//		}
//	}
//}
