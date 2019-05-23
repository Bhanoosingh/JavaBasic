package Date_09_05_2019;

import java.util.Arrays;

public class Exp1 {

	public static void main(String[] args) {
		int arr[][]= {{2,3,4},{5,6,7},{8,9,6}};
		int brr[][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		int crr[][]=new int[3][3];
		
		System.out.println("Matrix Arr:-");
		for(int a[]:arr) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println("\n\nMatrix brr:-");
		for(int b[]:brr) {
			System.out.println(Arrays.toString(b));
		}
		
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				for(int k=0;k<brr.length;k++) {
					crr[i][j]=crr[i][j]+arr[i][k]*brr[k][j];
				}
			}
		}
		System.out.println("\n\nMatrix crr:-");
		for(int c[]:crr) {
			System.out.println(Arrays.toString(c));
		}

	}

}
