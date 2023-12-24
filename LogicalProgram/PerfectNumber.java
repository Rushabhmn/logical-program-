package LogicalProgram;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=28;
		int  tem=0;
		 for (int j = 1; j <= num/2; j++) 
		 {
			 if(num%j==0)
			 {
				 tem += j;
				
				 System.err.println(tem);
			 }
			
		}
		 if(num==tem)
		 {
			 System.out.println("number is perfect number ");
		 }
		 else {
			 System.out.println("number not perfect");
		 }
	}

}
