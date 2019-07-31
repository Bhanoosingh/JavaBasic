
package example1;


public class Armstrong {
    
    public static void main(String[] args) {
        for(int i=100;i<=999;i++)
        {
            int ars=0;
            for(int j=i;j>0;j=j/10)
            {
                int d=j%10;
                ars=ars+(d*d*d);
            }
            System.out.print(ars==i?i+", ":"");
        }
    }
    
}
