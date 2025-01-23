package Problem6;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = in.next();
		String check = "";
		for(int i =s.length()-1;i>=0;i--) {
			check += s.charAt(i);
		}
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) != check.charAt(i)) {
				System.out.println("Not palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
	}
}
