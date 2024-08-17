package oop;
import java.util.Scanner;
public class Vowels
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=0;
		System.out.println("Number of vowels in given string");
		for(int i=0;i<(str.length());i++)
		{
		if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||
				(str.charAt(i)=='u'))
		{ count++; }
		}
		if(count==0)
		{
			System.out.println("No vowels in the given string");
		}
		else
		{
			System.out.println("Vowels in the string="+count);
		}
    }
}
			