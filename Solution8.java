import java.util.Scanner;
import java.util.StringTokenizer;
class Solution8 {
 public static void main(String [] args) { 
	Scanner sc = new Scanner(System.in);
	Integer choice ;
	do{
	System.out.println("1.replace the char in String \n 2.Eliminate numeric values in string \n3.With and Without ignore case \n4. find number of occurrence of sub string \n5.Eliminate subString in string\n6.Replace String with give subString\n7.String tokenizer");
	choice = sc.nextInt();
	sc.nextLine(); 
	switch(choice)
	{
	case 1:
	{
	System.out.println("Replace the character in String");
	System.out.println("Enter the String");
	String s =sc.nextLine();
	System.out.println("Enter the character and replacing character");
        char a = sc.nextLine().charAt(0);
	char b = sc.nextLine().charAt(0);
	String string ="";
	char[] array = s.toCharArray();
	for(int i=0;i<array.length;i++)
	{
	if(array[i] == a )
	{
	string = string+Character.toString(b);
	}
	else
	{
	string = string+Character.toString(array[i]);
	}
	}
	System.out.println(string);
	break;
	}
	case 2:
	{
	System.out.println("Removing numeric character in String");
	System.out.println("Enter the String with Special Character ");
	String ss = sc.nextLine();
	ss = ss.replaceAll("[0-9]"," ");
	System.out.println("After removing all numberic character: "+ss);
	


	break;
	}
	case 3:
	{
	System.out.println("Program for using with and without ignorecase ");
	System.out.println("Enter the string one");
	String str1=sc.nextLine();
	System.out.println("Enter the string  two");
	String str2 = sc.nextLine();
	System.out.println("Using Ignore case :"+str1.equalsIgnoreCase(str2));
	System.out.println("Without using ignore case :"+str1.equals(str2));
	break;
	}
	case 4:
	{
	System.out.println("find number of occurrence of sub string");
	System.out.println("Enter the String");
	String str = sc.nextLine();
	System.out.println("Enter the subString");
	String occ = sc.nextLine();
	int count=0,fIndex=0;
	while((fIndex = str.indexOf(occ,fIndex))!=-1)
	{
	count++;
	fIndex++;
	}
	System.out.println("Number of occurrence of the sub string is:"+count);
	break;
	}
	case 5:
	{
	System.out.println("Eliminating Substring from the String\nEnter the Substring to eliminate");
	String stringel = sc.nextLine();
	String eli=sc.nextLine();
	stringel = stringel.replaceAll(eli,"");
	//stringel=stringel.replaceAll("\\s","");
	System.out.println(stringel);
	break;	
	}
	case 6:
	{
	System.out.println("program to replace String with give subString\nEnter the String");
	String str2= sc.nextLine();
	System.out.println("Enter the finding string");
	String str3=sc.nextLine();
	System.out.println("Enter the replace string");
	String strrep=sc.nextLine();
	str2=str2.replaceAll(str3,strrep);
	System.out.println(str2);
	break;
	}
	
	case 7:
	{
	System.out.println("Program to perform String tokeniser\nEnter the String");
	String str = sc.nextLine();
	StringTokenizer s = new StringTokenizer(str,",");
	System.out.println("count of tokens by using countTokens() is :"+s.countTokens());
	System.out.println("printing tokens by using delimiters is :"+s.nextToken(","));
	
	break;
	}
	}
	}while(choice>0 && choice <=6);	
	
     }
}