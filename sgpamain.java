import java.util.*;
class sgpa
{
	Scanner scan = new Scanner(System.in);
	String usn=new String();
	String id=new String();
	int n,totalcredits,sum;
	sgpa(String _usn,String _id)
	{
		usn=_usn;
		id=_id;
	}
	sgpa()
	{	
		totalcredits=0;
		sum=0;
		
	}
	sgpa input()
	{
		sgpa temp = new sgpa();
		System.out.print("Enter n:");
		n = scan.nextInt();
		double marks[] = new double[n];
		int credits[] = new int[n];
		int grades[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter marks:");
			marks[i] = scan.nextInt();
			System.out.print("Enter credits:");
			credits[i] = scan.nextInt();
			temp.totalcredits += credits[i];
			if(marks[i]>=90 && marks[i]<=100)
			{
				grades[i] = 10;
			}
			if(marks[i]>=75 && marks[i]<90)
			{
				grades[i] = 9;
			}
			if(marks[i]>=60 && marks[i]<75)
			{
				grades[i] = 8;
			}
			if(marks[i]>=50 && marks[i]<60)
			{
				grades[i] = 7;
			}
			if(marks[i]>=45 && marks[i]<50)
			{
				grades[i] = 6;
			}
			if(marks[i]>=40 && marks[i]<45)
			{
				grades[i] = 5;
			}
			if(marks[i]<40)
			{
				grades[i] = 0;
			}
		}
		for(int i=0;i<n;i++)
		{
			temp.sum += (credits[i]*grades[i]);
		}
		return temp;
	}
	void display(sgpa p)
	{
		float res;
		res=(float)p.sum/p.totalcredits;
		System.out.println("SGPA is"+res);
	}
}				
class sgpamain
{		
	public static void main(String args[])
	{		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Name:");
		String str1=scan.next();
		String str2=scan.next();
		sgpa obj1=new sgpa(str1,str2);
		sgpa obj2=new sgpa();
		sgpa obj3=new sgpa();
		sgpa obj4=new sgpa();
		obj2=obj3.input();
		obj4.display(obj2);
	}
}		
		
					
