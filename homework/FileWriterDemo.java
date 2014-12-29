package 字节流;

import java.io.FileWriter;
import java.io.IOException;

/*
 * File 对象：用于操作文件
 * 
 * 流对象：用于操作文件内容
 * 
 * 
 */
public class FileWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("new.txt",true);
		//原文件存在，write会覆盖原文件内容
		fw.write("我的个去");
//		fw.flush();
//		fw1.flush();
		fw.close();
		FileWriter fw2=new FileWriter("海上明月共潮生.txt", true);
		fw2.write("aaaa");
		fw2.write("bbbb");
		fw2.close();
	}

}
