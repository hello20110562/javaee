package 字节流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//文件中对异常的处理
public class ExceptionTestInStream {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//字符输出流
		FileWriter fw=null;
		try {
		  fw=new FileWriter("baidu.txt");
			fw.write("春江潮水连海平");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if (fw!=null) {
				try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			}
			
		}
	}

}
