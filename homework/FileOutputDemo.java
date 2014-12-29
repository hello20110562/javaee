package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	/**
	 * @param args
	 * @throws java.io.FileNotFoundException
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//1、创建文件对象、创建刘对象	
//    FileOutputDemo file=new FileOutputDemo();
		FileInputStream file=new FileInputStream("./src/字节流/FileInPutDemo.java");
		FileOutputStream fo=new FileOutputStream("O.txt");
		//2、IO写
//		System.out.println(file);
		
//		size=fie.read(buff);
//		System.out.println(new String(buff, 4, size-4));
		byte[] buff = new byte[30];
		int size=0;
		while ((size=file.read(buff))!=-1) {
			fo.write(buff);
			System.out.println(new String(buff, 2, size-2));
		}
			
		}
	}


