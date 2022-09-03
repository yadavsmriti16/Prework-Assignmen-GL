import java.util.Scanner; 
public class FirstLetterPrinter{
	public static void main(String[] args) 
	{ 
		 Scanner in = new Scanner(System.in); 
		 String input = in .nextLine(); 
		 System.out.println(firstLetterPrinter(input)); 
		 } 
		 static String firstLetterPrinter(String str) { 
			 int n=str.length(),k=0;
			 String temp;
			 char[] res=new char[n];
			 char[] ch = str.toCharArray();
			 res[0]=ch[0];
			 for(int i=1;i<n;i++)
			 {
				 if(ch[i]==' ')
				 {
					 res[k+1]=ch[i+1];
					 k++;
				 } 
			 }
			 temp=new String(res);
			 return temp;
			 
}
}