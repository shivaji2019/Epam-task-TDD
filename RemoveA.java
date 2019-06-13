import java.util.*;
class rem{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String str;
	str=sc.nextLine();
	String temp="";
	if(str.charAt(0)=='a' ||str.charAt(0)=='A')
	{
	temp=str.substring(1);
	System.out.println(temp);
	}
	else
	{
	System.out.println(str);	
	}
	}
}	
	