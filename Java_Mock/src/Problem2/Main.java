package Problem2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemets of the array");
		for(int i =0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Duplicate numbers");
		for(int i=0;i<n-1;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.print(arr[i]+" ");
				for(int j=i+1;j<n;j++) {
					if(arr[i] != arr[j]) {
						i = j-1;
						break;
					}
					if(j == n-1) {
						i = n;
					}
				}
			}
		}
	}
}
