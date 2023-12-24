package LogicalProgram;

import java.util.Scanner;

public class PrimeNo 
	{
		public static void main(String[] args) {
			for(;;)
			{
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			int count=0;
			
			if(a>1)
			{
				for(int i=1;i<=a;i++)
				{
					if(a%i==0)
						count++;
				}
				if (count==2)
				{
					System.err.println("prime no");
				}
				else
					System.err.println("not prime");
				
			}	
			else
			{
				System.err.println("not prime no");
			}
		
				
		}

		}
	}


