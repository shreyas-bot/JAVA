import java.util.*;

abstract class Shape
{
	int a;
	Shape()
	{
		a = 1;
	}
	
	Shape(int x)
	{
		a = x;
	}
	
	abstract void calc();
}

class Rectangle extends Shape
{
	int b;
	Rectangle()
	{
		b = 1;
	}
	
	Rectangle(int x, int y)
	{
		a = x;
		b = y;
	}
	void calc()
	{
		System.out.println(a*b);
	}
}
	
class Triangle extends Shape
{
	int b;
	Triangle()
	{
		b = 1;
	}
	
	Triangle(int x, int y)
	{
		a = x;
		b = y;
	}
	void calc()
	{
		System.out.println(0.5*a*b);
	}
}

class Circle extends Shape
{
	Circle(int x)
	{
		a = x;
	}
	void calc()
	{
		System.out.println(3.14*a*a);
	}
}	
class abs
{
	public static void main(String arg[])
	{
		int a;
		int b;
		System.out.println("Enter 1: Rectangle, 2: Circle, 3: Triangle");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		switch(x)
		{
			case 1: 
				System.out.println("Enter Values for Rectangle");
				a = scan.nextInt();
				b = scan.nextInt();
				Rectangle r = new Rectangle(a, b);
				r.calc();
				break;
			case 2:
				System.out.println("Enter Values for Circle");
				a = scan.nextInt();
				Circle c = new Circle(a);
				c.calc();
				break;
			case 3:
				System.out.println("Enter Values for Triangle");
				a = scan.nextInt();
				b = scan.nextInt();
				Triangle t = new Triangle(a, b);
				t.calc();
				break;
		}
	}
}
