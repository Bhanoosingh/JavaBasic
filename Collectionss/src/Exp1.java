import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Exp1 {

	public static void main(String[] args)throws IOException {
		List<Float> oblist=new LinkedList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String ch="";
		do {
			System.out.println("Enter a float value:-");
			oblist.add(Float.parseFloat(br.readLine()));
			
			System.out.println("\n\nDo you want to add more Y/N ?");
			ch=br.readLine();
		}while(ch.equalsIgnoreCase("y"));
		
		System.out.println(oblist);
		

	}

}
