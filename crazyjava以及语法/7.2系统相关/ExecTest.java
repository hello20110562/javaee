import java.lang.Runtime;
public class ExecTest{
	public static void main(String[] args)throws Exception{
		Runtime rt = Runtime.getRuntime();
		
		//打开记事本
		rt.exec("notepad.exe");

	
	}

}