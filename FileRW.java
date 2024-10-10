package oop;
import java.util.*;
import java.io.*;
public class FileRW {
	public static void main(String [] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			File obj = new File("Register1.txt");
			obj.createNewFile();
			System.out.println("Register1.txt have been created");
			
			FileWriter fw = new FileWriter("Register1.txt");
			System.out.println("Enter your KEAM rank: ");
		    int keamRank = scanner.nextInt();
		    fw.write(keamRank+"\n");
		    fw.close();
		    System.out.println("Data Added");
		    
		    FileReader fr = new FileReader("Register1.txt");
		    BufferedReader br = new BufferedReader(fr);
		    System.out.println("Content of Register1.txt = ");
		    String line;
		    
		    while((line = br.readLine()) != null) {
		    	System.out.println(line);
		    }
		    br.close();
		    scanner.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		  }
	}
}
	