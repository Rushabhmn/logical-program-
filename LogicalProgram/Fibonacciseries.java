package LogicalProgram;

public class Fibonacciseries {
public static void main(String[] args) {
	
	int  n1=0;
	int  n2=1;
	System.err.print(n1 +" "+ n2);
	
	
	for (int i = 0; i < 10; i++) {
		int sum=n1+n2;
		System.err.print(" "+sum);
		n1=n2;
		n2=sum;
	}
	
}
}
