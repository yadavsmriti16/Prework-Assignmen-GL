import java.util.Scanner;
public class PatternPrinter {
	public static void main(String[] args) { 
		 Scanner in = new Scanner(System.in); 
		 int n = in .nextInt(); 
		 patternPrinter(n); 
		 } 
		 static void patternPrinter(int n) { 
		 
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=n;j>=1;j--)
			 {
			 for(int k=1;k<=i;k++)
			 {
			 System.out.print(j);
			 }
			 }
			 System.out.println();
			 }
		
		 
		 
}
}