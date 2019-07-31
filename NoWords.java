package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoWords {
    public static void main(String[] args) throws IOException{
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        
        System.out.println("Enter a string value:-");
        String str=br.readLine();
        int count=0;
        str=str.trim();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        System.out.println("No of words are:-"+(count+1));
    }
}
