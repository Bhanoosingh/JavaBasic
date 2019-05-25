import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exp9 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		Map<String,List<String>> obList=new HashMap<>();
		String ch="";
		
		do {
			System.out.println("Enter country name:-");
			String country=br.readLine();
			
			String x="";
			List<String> state=new ArrayList<>();
			do {
				System.out.println("Enter State name:-");
				state.add(br.readLine());
				System.out.println("do you want to add more state ! y/n :-");
				x=br.readLine();
			}while(x.equalsIgnoreCase("y"));
			
			obList.put(country, state);
			
			System.out.println("do you want to continue y/n :-");
			ch=br.readLine();
		}while(ch.equalsIgnoreCase("y"));
		
		
		System.out.println("We have Following values");
		Set<String> countries=obList.keySet();
		
		for(String key:countries) {
			System.out.println(key+"----------->"+obList.get(key));
		}

	}

}
