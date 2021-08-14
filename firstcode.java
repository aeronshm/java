package onlinevideos;
import java.util.Scanner;

public class firstcode 
{
	public static void main(String args[])
	{
int a = 6 ;
System.out.println(a);

//selection
int n = 0;

if (n%2==0 || n==0) 
	System.out.println("even");

	else  // n%2!=0
	System.out.println("odd");


// ternery op
// ?: -> condition ? expr 1 : expr 2

int i = 7, j=0;

j = i>6?1:2;
System.out.println(j);

//switch

int s= 4;
switch(s)
{
case 1:
	System.out.println("one");
	break;
	
case 2:
	System.out.println("two");
	break;
	
case 3:
	System.out.println("three");
	break;

	default :
		System.out.println("no match found");		
		}

//loop , iteration
//while, do while, for, for each
int c=0;
while(c<2)
{
	System.out.println("hello using while");
	c++;
	}
//**************
int d = 6;
do {
	System.out.println("once do while");
	d++;
}
while (d<2);

//**********
for(int b=1;b<5;b++)
{
 System.out.println("hello for loop");	
}
//***********


	}
}   
