
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Subarraysumzero
{
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(sc.readLine());
        int [] a =  new int[n];
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(sc.readLine());
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
             {
               sum=0;
                 for(int j=i;j<n;j++)
                 {
                    sum=sum+a[j];
                    if(sum==0)
                    {
                      System.out.println(a[i]+" "+a[j]);
                      count++;
                    }

                 }
             }
                    
 
                 System.out.println(count);



		
	}
}
