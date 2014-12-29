package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream 是抽象类，要用子类实例化对象
 * 
 */
public class FileInPutDemo {


	

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		//1、创建流文件对象
//		System.out.println(".");
		File file= new File("./src/字节流/FileInPutDemo.java");
		//2、创建流对象：
		@SuppressWarnings("resource")
		FileInputStream fie=new FileInputStream(file);
		System.out.println(file.getPath());
		System.out.println(file.getPath());
		//IO 读
//		int ch=0;
//		while ((ch=fie.read())!=-1) {
//			System.out.print((char)ch);
//		}
//		System.out.println("=======");
		


//		byte[]buff=new byte[1024];
//		int size=0;
//		size=fie.read(buff);
//		System.out.println(new String(buff, 4, size-4));
//		while ((fie.read(buff))!=-1) {
//			System.out.println(new String(buff));
//		}
	}

}
