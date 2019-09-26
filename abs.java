import java.util.*

abstract class A
{
	int a;
	A()
	{  }
	A(int x)
	{
		a=x;
	}
	abstract void class();
}
class B extends A
{
	int b;
	B()
	{   }
	B(int x,int y)
	{
		a=x;
		b=y;
	}
	void calc()
	{
		System.out.println(a+""+b);
	}
}
abstract class C extends A
{
	int a,b;
	C()
	{}
	C(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract void calc();	
}
class abstractclass
{
	public static void main(String args[])
	{
		B b=new B(10,20);
		b1.calc;
		C c;
		B b2=new B(50,100);
		c=b2;
		c.calc();
	}
}		
								
	
