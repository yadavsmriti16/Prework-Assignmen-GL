import java.util.Scanner;
public class MissingNumberFinder{
	 public static void main(String[] args) { 
		 Scanner in = new Scanner(System.in); 
		 int size = in .nextInt(); 
		 int[] arr = new int[size - 1]; 
		 for (int i = 0; i < size - 1; i++) arr[i] = in .nextInt(); 
		 System.out.println(missingNumberFinder(arr, size)); 
		 }
		 static int missingNumberFinder(int array[], int n) 
		 { 
			 int m,t,k=0,res=0;
			 m=n-1;
		 
			for(int i=0;i<m-1;i++)
			{
				for(int j=0;j<m-i-1;j++)
				{
				if(array[j]>array[j+1])
				{
					t=array[j];
					array[j]=array[j+1];
					array[j+1]=t;
				}
				}
			}
			if(array[0]!=1)
				{
					res=1;
				}
				else
				{
				
			for(int i=0;i<m-1;i++)
			{
			 if(array[i+1]-array[i]>1)
				{
				k=1;
				res =array[i+1]-1;
				break;
				}
			}
				if(k==0)
				{
					res=array[m-1]+1;
				
				}
			}
			return res;

}
}