package learningjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatriceSum {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[][]= {
						{3,2,3},
						{4,6,7},
						{8,11,12}
						};
		int brr[][]=new int [3][3];
		int crr[][]=new int [3][3];
		System.out.println("Enter 9 numbers");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				brr[i][j]=Integer.parseInt(br.readLine());
				
				crr[i][j]=arr[i][j]+brr[i][j];
			}
			
		}
		System.out.println("Matrice Arr:-");
		for(int row[]:arr)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("Matrice Brr:-");
		for(int row[]:brr)
		{
			System.out.println(Arrays.toString(row));
		}
		System.out.println("Result Matrice Crr = Arr + Brr :-");
		for(int row[]:crr)
		{
			System.out.println(Arrays.toString(row));
		}
		
		
		
		
		
		
		

	}

}
