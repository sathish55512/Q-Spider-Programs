package Problem4;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}
}
