import java.util.Scanner;
class Fullprogram{
	public static void main(String [] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("1.Biggest number \n 2.Ascending order \n 3.Fibonacci series \n 4.Factorial \n 5.palindrome \n 6.String copy \n 7.String array sorting \n 8.string concatenate");
	System.out.println("Enter your choice");
	int choice = sc.nextInt();
	switch(choice)
	{
		case 1:	
		{
		System.out.println("Finding Biggest number in array \n Enter the array size");
		Integer arrayno = sc.nextInt();
		Integer [] bigarray = new Integer [arrayno];
		System.out.println("Enter the element for array to find biggest no in array");
                for(int i=0;i<arrayno;i++)
		{
		bigarray[i]=sc.nextInt();
		}
		int big = bigarray[0];
		for(int j=1;j<arrayno;j++)
		{
		if(big < bigarray[j])
			{
		big=bigarray[j];
			}
		}
	   System.out.println("The biggest element in the array is "+ big);

		break;
		}
		case 2:
		{
		System.out.println("Enter the ArraySize");
	Integer no = sc.nextInt();
        sc.nextLine();
	int [] array = new int [no];
      System.out.println("Enter the array elements");
	for(int i =0;i< no;i++)
		{
	 array[i] = sc.nextInt();
		}


	for(int y =0 ;y<no-1;y++)
	{
	for(int k = y+1;k<no;k++)
	{
	if(array[y] > array[k]) 
	{
	int temp;
	temp = array[y];
	array[y]=array[k];
	array[k]=temp;
	}	
	}	
	}
	for(int j =0;j<no;j++)
	{
	System.out.println(array[j]);	
	}	
		break;
		}
		case 3:
		{
			Integer prev,cur = 1,pri = 0;
		System.out.println("Fibonacci Series \n Enter the number for printing fibonacci series");
			Integer no = sc.nextInt();
		System.out.println("Fibanocci series are");
		for(int i=0;i<no;i++)
		{
		   System.out.println(pri);
		
		prev = pri + cur;
	        pri=cur;
		cur = prev;
		
		}
			break;
		}
		case 4:
			{
		System.out.println("Factorial Number\nenter the number to find factorial");
		Integer input = sc.nextInt();
			int sum=1;
                        while(input > 0)
                                 {
				sum = sum*input;
					input--;
				  }
  		System.out.println("Factorial of given input is " + sum);
		
		break;	
		}
		case 5:
			{
			System.out.println("Enter the String to check palindrome or not");
		sc.nextLine();
			String input = sc.nextLine();
		StringBuilder one = new StringBuilder(input);
		String output = one.reverse().toString();
		if(input.equals(output))
			{
			System.out.println("Given input is palindrome");
			}
		else
			{
			System.out.println("Given input is not palindrome");
			}
			break;
			}
		case 7:
		{
		System.out.println("Enter the String array Size");
		Integer arraysize = sc.nextInt();
		sc.nextLine();

 		String [] str = new String[arraysize];
		System.out.println("Enter the string to store in array");
		for(int m=0;m<arraysize;m++)
		{
		str[m]=sc.nextLine();
		}
      

       
       		 for (int i = 0; i < arraysize; i++) 
       		 {
         	   for (int j = i + 1; j < arraysize; j++) { 
            			    if (str[i].compareTo(str[j])>0) 
              		  {
		    String  temp;
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
	System.out.println("Sorted String array is ");
	for(int i=0;i<arraysize;i++)
	{

	    System.out.println(str[i]);
	}


		break;
		}
		case 8:
		{
		System.out.println("Enter the String 1 and String 2"); 
		sc.nextLine();
	 	String firstString = sc.nextLine();
	        String secondString = sc.nextLine();
                 System.out.println("the concatenate Stirng is : "+firstString + secondString);	
		break;	
		}
         }
   }
}
	       