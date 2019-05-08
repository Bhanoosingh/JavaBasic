package Date_08_05_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exp1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows");
		int n = Integer.parseInt(br.readLine());
		System.out.print("Enter number of cols");
		int m = Integer.parseInt(br.readLine());

		int arr[][] = new int[n][m];
		int brr[][] = new int[n][m];
		int crr[][] = new int[n][m];

		// Arr matrice input
		System.out.println("Enter Arr "+(n*m)+" values");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		// Arr matrice input

		// Brr matrice input
		System.out.println("Enter Brr "+(n*m)+" values");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				brr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		// Brr matrice input

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}

		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				System.out.print(crr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
