package File_Creation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Folder_Creation {
	public static void main(String[] args) throws IOException{
		//for Folder Creation
		File file = new File("D:\\Programming\\JAVA\\FileHandling\\file.txt");
//		boolean folder_created = file.mkdir();
//		if(folder_created) {
//			System.out.println("Folder created sucessfully");
//			
//		}
//		else {
//			System.out.println("Folder not created");
//		}
//		
//		//file creation
//		file = new File("D:\\Programming\\JAVA\\FileHandling\\file.txt");
//		
//		boolean file_created = file.createNewFile();
//		if(file_created) {
//			System.out.println("File created sucessfully");
//			
//		}
//		else {
//			System.out.println("File not created");
//		}
		
		//Write into file

		FileWriter fw =  new FileWriter(file);
		fw.append("\n1234567890");
		fw.append("\n12345678");
		fw.flush();
		System.out.println("code inserted");
		fw.close();
		
		// read from file
		Scanner in = new Scanner(file);
		while(in.hasNext()) {
			System.out.println(in.nextLine());
		}
	    file = new File("D:\\Programming\\JAVA\\FileHandling\\file.txt");
		file.delete();
	}
}
