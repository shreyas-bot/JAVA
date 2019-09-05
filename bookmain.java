import java.util.*;

class book
{
	String name;
	String author;
	float price;
	int num;

book()
{ }
book(String _name,String _author,float _price,int _num)
{
	name = _name;
	author = _author;
	price = _price;
	num = _num;
}
void getdata()
{
 	Scanner scan = new Scanner(System.in);
 	System.out.println("Enter Name");
 	name = scan.next();
 	System.out.println("Enter Author");
 	author = scan.next();
 	System.out.println("Enter price");
	price = scan.nextFloat();
 	System.out.println("Enter Pages");
 	num = scan.nextInt();
} 	
public String  toString()
{
	return(name+" "+author+" "+price+" "+num);
}
}
class bookmain
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of books");
		int n = scan.nextInt();
		book b[] = new book[n];
		for(int i=0;i<n;i++)
		{
			b[i] = new book();
			b[i].getdata();
			System.out.println(b[i]);
		}	
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
