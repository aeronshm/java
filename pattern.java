package onlinevideos;

public class pattern {
	public static void main(String[] args)
{
	int row=7;
	for(int i=1;i<row;i++)
	{
		for(int j=1;j<=i;j++)
			
		{
			System.out.print(j+ " ");
		}
	System.out.println();
	
	}
//**********
	int alpha=65;
	for(int p=0;p<6;p++)
	{
		for(int q=0;q<=p;q++)
		{
			System.out.print((char)(alpha + q ) + " ");
		}
	System.out.println();
	}
//*******
for(int c=0;c<6;c++)
{
	for(int d=2*(6-c);d>=0;d--)
	{
		System.out.print(" ");
	}
	for(int d=0;d<=c;d++)
	{
		System.out.print("* ");
		
	}
	System.out.println();
}
//******
for(int e=0;e<6;e++)
{
	for(int f=6-e;f>1;f--)
	{
		System.out.print(" ");
	}
		for (int f=0;f<=e;f++)
		{
			System.out.print("* ");
		}
		System.out.println();
}
//**********

for(int g=1;g<=4;g++)
{
	for(int h=1;h<=4;h++)
	{
		if(g==1||g==4||h==1||h==4)
		{
			System.out.print("* ");
		}else
			System.out.print("  ");
	}
	System.out.println();
}

}
}
