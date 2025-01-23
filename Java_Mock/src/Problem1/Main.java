package Problem1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans = 0;
		while(n!=0) {
			ans*=10;
			int temp = n%10;
			ans += temp;
			n/=10;
		}
		System.out.println(ans);
	}
}
