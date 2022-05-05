import java.util.*;
class TwoStackUsingOneArray
{
	int[]arr;
	int size;
	int top1;
	int top2;
	public TwoStackUsingOneArray(int n)
	{
		arr=new int[n];
		size=n;
		top1=n/2+1;
		top2=n/2;
	}
	public void pushFirst(int p)
	{ 
	   if(top1>0)
	   {
		top1--;
		arr[top1]=p;
	   }
	
	else
	{
		System.out.print("Stack overrflow");
		
	}
	}
	
	public void pushSecond(int p)
	{
		if(top2<size-1)
		{
			top2++;
			arr[top2]=p;
		}
		else{
			
			System.out.print("Stack overrflow");
		}
	}
	public int popFirst()
	{
		if(top1<=size/2)
		{
			int rem=arr[top1];
			top1++;
			return rem;
		}
		else{
			
		}
		return 0;
	}
	public int popSecond()
	{
		if(top2>=size/2+1)
		{
			int rem=arr[top2];
			top2--;
			return rem;
		}
		else{
			
		}
		return 0;
	}
	public static void main(String args[])
	{
		TwoStackUsingOneArray p=new TwoStackUsingOneArray(10);
		p.pushFirst(5); 
        p.pushSecond(10); 
        p.pushSecond(15); 
        p.pushFirst(11); 
        p.pushSecond(7); 
        p.pushSecond(40);
		System.out.println("Popped element from Stack1 is "+ p.popFirst());
		System.out.println("Popped element from Stack2 is "+ p.popSecond());

	}
}