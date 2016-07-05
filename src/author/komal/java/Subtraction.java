package author.komal.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtraction {

	/**
	 * @param args
	 */
	public static String sub(String a, String b)
	{
		int l1=a.length();
		int l2=b.length();
		for(int i=0;i<l1;i++)
		{
			char ch=a.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
			{
				return ("When A is "+String.format("%d", (a))+ " and B is "+String.format("%d", (b))+" the result is ERROR.");
			}
		}
		for(int i=0;i<l2;i++)
		{
			char ch=b.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
			{
				return ("When A is "+String.format("%d", (a))+ " and B is "+String.format("%d", (b))+" the result is ERROR.");
				
			}
		}
		
		double x=Double.parseDouble(a);
		double y=Double.parseDouble(b);
		return ("When A is "+String.format("%d", (x))+ " and B is "+String.format("%d", (y))+" the result is "+String.format("%d", (x-y))+".");//oString(x-y);
		
	}
	/*public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		String a="1",b="2";
		System.out.println(sub(a,b));
		

	}*/

}
