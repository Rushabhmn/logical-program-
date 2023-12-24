package LogicalProgram;

import java.util.Scanner;

public class ReverseNo {
		public static void main(String[] args) {
			int a ,tem;
			Scanner s= new Scanner(System.in);
			System.err.println("Enter value");
			 a=s.nextInt();
			/*int rev=0;
			while(a!=0)
			{
				rev=rev*10+a%10;
				a=a /10;
			}
		    System.err.println(rev);
		
			//using string buffer class
			 
			 StringBuffer sb=new StringBuffer(String.valueOf(a));
			 
			 StringBuffer rev=sb.reverse();
			 
			 System.err.println(rev);*/
			 StringBuilder sb1=new StringBuilder();
			 sb1.append(a);
			 StringBuilder rev= sb1.reverse();
			 System.err.println(rev);
			 
			 
		}

	}


