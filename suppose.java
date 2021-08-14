package onlinevideos;
import java.util.Scanner;

public class suppose {
public static void main(String[] args)
{
	//int row;
	System.out.println("enter the value of row");
	Scanner sc= new Scanner(System.in);
	int row=sc.nextInt();
	
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for(int j=i;j<=row;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	sc.close();
	
	
	
	
	
	
}
}
