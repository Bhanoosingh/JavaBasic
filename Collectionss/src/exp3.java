import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exp3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Map<String,List<String>> mapList=new HashMap<>();
		String ch="";
		do {
			System.out.println("Enter a country name:-");
			
			String country=br.readLine();
			List<String> state=new ArrayList<>();
			String x="";
			do {
				System.out.println("Enter name of state:-");
				state.add(br.readLine());
				System.out.println("Do you want to add more states Y/N ?");
				x=br.readLine();
			}while(x.equalsIgnoreCase("y"));
			mapList.put(country, state);
			System.out.println("Do you want to continue ? Y/N");
			ch=br.readLine();
		}while(ch.equalsIgnoreCase("y"));
		
		Set<String> keys=mapList.keySet();
		
		for(String s:keys) {
			System.out.println(s+"<------------->"+mapList.get(s));
		}
	}

}
