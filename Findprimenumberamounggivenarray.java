
import java.util.Scanner;
public class Findprimenumberamounggivenarray
{
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
    String [] str = s.split(" ");
    Integer flag=1,i;
    for(String k : str)
    {
    
        i=Integer.parseInt(k);
        for(int j=2;j<i/2;j++)
        {
            if(i%j==0)
            {
                flag++;
                break;
            }
        }
        if(flag==1)
        System.out.println(i);
        flag=1;
    }
    
	}
}
