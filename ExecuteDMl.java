

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class ExecuteDMl {
	private String driver;
	private String url;
	private String user;
	private String pass;
	/**
	 * @param args
	 */
	public void initParam(String paramFile) throws Exception
	{
		//通过properties类加载属性文件
		Properties props =new Properties();
		props.load(new FileInputStream(paramFile));
		driver =props.getProperty("driver");
		url =props.getProperty("url");
		user=props.getProperty("user");
		pass=props.getProperty("pass");	
	}
	public int insertDate(String sql)throws Exception{
		//加载驱动
			Class.forName(driver);
		//获取连接
			java.sql.Connection conn=DriverManager.getConnection(url,user,pass);
			//使用connection创建statement对象
			java.sql.Statement stmt=conn.createStatement();	
			//执行DML语句，返回受影响的记录条数
			return stmt.executeUpdate(sql);
		
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExecuteDMl ed=new ExecuteDMl();
		ed.initParam("mysql.ini");
		int result=ed.insertDate("insert into jdbc1_test(jdbc_name)"
					+"select goods_name "+"from tdb_goods ");
		System.out.println("--系统中共有"+result+"条记录受影响");
	}

}
