package sse;
class Test{
	
	
	@SuppressWarnings("unused")
	void run(int[]arr,int index){
		
		//System.out.println(arr[index]);
		if (index<0){
			
			throw new ArrayIndexOutOfBoundsException("xiaobiaofu");
		}
		else if(index>arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("shujuchangdu"+"\t"+arr.length);
		}
		else if (arr == null)
		{
			throw new NullPointerException("kongzhizhen");	
		}
	}
}
public class ExpectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =new int[4];
		int []array=null;
	
		//array[0]=123;
		//System.out.println("=====end===");
		Test test= new Test();
		//test.run(arr,-2);
		test.run(arr, 1);
		System.out.println("laji");
	}
	

}
