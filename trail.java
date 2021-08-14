package onlinevideos;
//import java.util.Scanner;

public class trail 
{
	public static void main(String[] args)
	{
	for(int i=1;i<=5;i++)
	{
		if(i==3)
		{
			continue;  //skip 7		
		}
		System.out.println("the value is " + i);
	}
	for(int j=6;j<=10;j++)
	{
		if(j>8)
		{
			break;
		}
		System.out.println("other values are " + j);
	}		
	}
}