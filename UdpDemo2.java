import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


class UdpSend2{
	public static void main(String []args) throws IOException{
		DatagramSocket ds= new DatagramSocket();
		//键盘录入！！！！！
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while ((line=buff.readLine())!=null) {
			if ("886".equals(line)) 
				break;
				
				byte [] buf=line.getBytes();
				
				DatagramPacket dp= new DatagramPacket(buf, buf.length,
									InetAddress.getByName("10.205.1.56"),6555);
			
				ds.send(dp);		
		}
				ds.close();
	}
}
class UdpRece2{
	public static  void main(String [] args) throws IOException {
		DatagramSocket ds1=new DatagramSocket(6555);
		
		while (true){
			byte []buff = new byte[1024];
			
			DatagramPacket dp=new DatagramPacket(buff,buff.length);
			ds1.receive(dp);
			
			String ip=dp.getAddress().getHostAddress();
			String data=new String(dp.getData(),0,dp.getLength());
			
			System.out.println(ip+"::"+data);
		}
	}
}