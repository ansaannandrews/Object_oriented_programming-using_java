package oop;
import java.util.Scanner;
public class Frequency
{
    public static void main(String[] args)
    {   
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter the Character");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		for(int i=0;i<(str.length());i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
        }
		System.out.println("Character "+ch+" occured "+count+" times");
    }
}