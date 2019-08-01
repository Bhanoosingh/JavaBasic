import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysPratice {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		
		//datatype arrayname[]=new datatype[size];
		//int arr[]=new int[10];
		//int []arr=new int[10];
		int[] arr=new int[10];
		//int arr[]= {1,2,44,55,77,88,99,45,47,69,56,23,89,123,156,148};
		
		int l=arr.length;
		System.out.println("Enter 10 numbers:-");
		for(int i=0;i<l;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
