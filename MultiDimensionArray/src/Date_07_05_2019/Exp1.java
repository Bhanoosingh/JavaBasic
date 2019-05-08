package Date_07_05_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exp1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		//datatype arrayname[][]=new datatype[row][col]
		char arr[][]= {{'B','h','a','n','o','o'},
					   {'A','k','a','s','h','a'},
					   {'A','b','h','i','n','v'},
						};
		
		for(int i=0;i<arr.length;i++) {//arr.length will tell no of rows
			for(int j=0;j<arr[i].length;j++) {//arr[i].length will tell no of columns for ith row
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		//User input
		/*
		 * for(int i=0;i<arr.length;i++) {
		 * System.out.print("Enter a Character "+(i+1)+" :-");
		 * arr[i]=br.readLine().charAt(0); }
		 */
		//User input
		
		//System.out.println(Arrays.toString(arr));

	}

}
