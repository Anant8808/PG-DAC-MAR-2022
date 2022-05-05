import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		insert(arr);
		
	}
	
	public static void insert(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int k=arr[i];
			int j;
			
			for( j=i-1;j>=0 && arr[j]>k;j--)
			{
				arr[j+1]=arr[j];
				call(arr);
			}
			
			arr[j+1]=k;
		}
		
		
			call(arr);
		
		
		
	}
	
	public static void call(int arr[])
	{
		
 		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}