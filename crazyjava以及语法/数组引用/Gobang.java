package waus;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import sun.java2d.pipe.BufferedBufImgOps;

public class Gobang {
	private String[][] board;
	private static int Bord_size=15;
	public void initBord()
	{
		board=new String[Bord_size][Bord_size];
		for (int i=0;i<Bord_size;i++)
		{
			for(int j=0;j<Bord_size;j++)
			{
				board[i][j]="+";
			}
		}
	}
	//在控制台打印出棋盘
	public void printBord()
	{
		for (int i=0;i<Bord_size;i++)
		{
			for(int j=0;j<Bord_size;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Gobang bg=new Gobang(); 
		bg.initBord();
		bg.printBord();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputStr=null;
		// TODO Auto-generated method stub
		
		while ((inputStr=br.readLine())!=null)
		{
			String [] posStrArr= inputStr.split(",");
			int xPos=Integer.parseInt(posStrArr[0]);
			int yPos=Integer.parseInt(posStrArr[1]);
			bg.board[xPos-1][yPos-1]="*";
			bg.printBord();
			System.out.println("请输入您下棋的坐标");
		}

	}

}
