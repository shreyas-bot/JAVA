package cie;
import java.util.*;
public class Internal
{
	public double cie_marks[] = new double[5];
	Scanner vs = new Scanner(System.in);
	public void getdata()
	{
		System.out.println("CIE MARKS");
		for(int i =0; i<5;i++){
			System.out.println("Enter marks of subject"+ (i+1));
			cie_marks[i] = vs.nextDouble();
	}
}
Signed in as shreyas-bot

import cie.*;

public class Student
{
	public  int usn;
	public  String name;
	public  int sem;
}
