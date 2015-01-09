
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.jdbc.ResultSetMetaData;

public class ExecuteSQL {

	/**
	 * @param args
	 */
  
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
		public void executSql(String sql)throws Exception{
				//加载驱动
			Class.forName(driver);
				//获取连接
			java.sql.Connection conn=DriverManager.getConnection(url,user,pass);
				//使用connection创建statement对象
			java.sql.Statement stmt=conn.createStatement();	
				//执行DML语句，返回受影响的记录条数
			boolean hasResultSet =stmt.execute(sql);
			if (hasResultSet)
			{
				//获取结果集		
				ResultSet rs=stmt.getResultSet();
				//ResultSetMetaData 用于分析结果集的元数据接口
				java.sql.ResultSetMetaData rsmd=rs.getMetaData();
				int columnCount=rsmd.getColumnCount();
				//Result系类get方法，用于获取记录指针
				//指针指向特定行、列的值，不断使用next（）将指针下移，如果移动之后，指针仍
				//指向有效执行，则返回true
				while (rs.next()) {
					for (int i = 0; i < columnCount; i++)
					{
						System.out.println(rs.getString(i+1)+"\t");
					}
						System.out.println("\n");
					}
							// TODO: handle exception
			}
			else 
			{
					System.out.println("该SQL语句影响的记录有"+stmt.getUpdateCount()+"条");
			}
		}
				
			
		public static void main(String[] args) throws Exception
		{
				// TODO Auto-generated method stub
				ExecuteSQL ed=new ExecuteSQL();
				ed.initParam("mysql.ini");
				System.out.println("----执行删除表的DDL语句----");
				ed.executSql("drop table if exists my_test");
				System.out.println("-----执行建表的DDL语句-----");
				ed.executSql("create table my_test"
				+"(test_id int auto_increment primary key,"
				+"test_name varchar(256))");
				System.out.println("-----插入数据的DML语句-----");
				ed.executSql("insert into my_test(test_name) " +
						"select cate_name from tdb_goods_cate");
				System.out.println("----执行查询数据的查询语句-----");
				ed.executSql("select *from my_test");
		}
  }

	


