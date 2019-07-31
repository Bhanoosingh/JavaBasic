
package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NameToInti {
    public static void main(String[] args)throws IOException {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        
        System.out.println("Enter a string value:-");
        String str=br.readLine();
        int sp=0;
        str=str.trim();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                System.out.print(str.substring(sp,sp+1).toUpperCase()+".");
                sp=i+1;
            }
        }
        System.out.println(str.substring(sp,sp+1).toUpperCase()
                +str.substring(sp+1).toLowerCase());
    }
}

