package oop;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String [] args) {
	try {
	    File obj = new File("filename1.txt");
	    obj.createNewFile();
	}  catch(IOException e) {
		System.out.println(e.getMessage());
	  }
   }
}