import java.util.Scanner;
public class Attendance
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n,i,a=0,k=0,pcount=0,acount=0;
		System.out.print("Enter Class => ");
		char c = sc.next().charAt(0);

		switch(c)
		{
			case 'A': a = 101;
			break;

			case 'B': a = 201;
			break;

			case 'C': a = 301;
			break;

			case 'D': a = 401;
			break;

			case 'E': a = 501;
			break;
		}

		System.out.print("Enter Total Number of Students => ");
		n = sc.nextInt();

		int x[] = new int[n];
		int xy[] = new int[n];

		for(i=0;i<n;i++)
		{
			System.out.print(a + " is " );
			x[i] = sc.next().charAt(0);

			if(x[i] == 'p' || x[i] == 'P')
			{
				pcount++;
			}

			else
			{
				acount++;
				xy[k++] = a;
			}
			a++;
		}

		System.out.println("Total Present Numbers are " + pcount);
		System.out.println("Total Absent Numbers are " + acount);

		for(i=0;i<k;i++)
		{
			System.out.print(xy[i] + " , ");
		}



		// int n,x=101,i,k=0;

		// System.out.println("Enter A,B,C,D,H");
		// char ch=sc.next().charAt(0);
		// switch(ch)
		// {
		// 	case 'A': x=101;
		// 		break;
		// 	case 'B': x=201;
		// 		break;
		// 	case 'C': x=301;
		// 		break;
		// 	case 'D': x=401;
		// 		break;
		// 	case 'H': x=501;
		// 		break;
		// }

		// System.out.println("Enter number of students in class:");
		// n=sc.nextInt();

		// int a[];
		// int ab[];
		// ab=new int[n];
		// a=new int[n];

		// for (i = 0 ; i < n ; i++ ) 
		// {
		// 	a[i]=x;
		// 	x++;
		// }

		// for (i = 0 ; i < n ; i++ ) 
		// {
		// 	System.out.print(a[i]+" is present? ");
		// 	char c=sc.next().charAt(0);
		// 	if(c=='n')
		// 	{
		// 		ab[k++]=a[i];
		// 	}
		// }

		// for (i=0;i<k;i++ ) 
		// {
		// 	System.out.print(ab[i]+", ");
		// }
	}
}