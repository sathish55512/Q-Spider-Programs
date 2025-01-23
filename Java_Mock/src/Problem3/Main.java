package Problem3;

import java.util.Arrays;
import java.util.Scanner;

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

		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
