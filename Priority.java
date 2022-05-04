package packa;
import java.util.*;

public class Priority<T>
{
	
	ArrayList<Element<T>> heap;
	
	public Priority()
	{
		heap=new ArrayList<>();
	}
	public void display()
	{
		
		for(int i=0;i<heap.size();i++)
		{
			System.out.print("Name of patient is "+ heap.get(i).data+" "+" Priority number assigned to it="+heap.get(i).priority);
			System.out.println();
		}
	}
	
	public int isSize()
	{
		return heap.size();
	}
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	public T getMin()throws PriorityQueueEmptyException
	{
		if(heap.isEmpty())
		{
			throw new PriorityQueueEmptyException();
		}
		return heap.get(0).data;
	}
	public T Removemin_downheapify()
	{
		Element<T> ans=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentindex=0;
		int leftchildindex=2*parentindex+1;
		int rightchildindex=2*parentindex+2;
		while(leftchildindex < heap.size())
		{
		int minindex=parentindex;
		if(heap.get(minindex).priority > heap.get(leftchildindex).priority)
		{
			minindex=leftchildindex;
		}
		if(rightchildindex < heap.size() && heap.get(minindex).priority > heap.get(rightchildindex).priority)
		{
			minindex=rightchildindex;
		}
		if(minindex==parentindex)
		{
			break;
		}
		Element<T> temp=heap.get(parentindex);
		heap.set(parentindex,heap.get(minindex));
		heap.set(minindex,temp);
		parentindex=minindex;
		leftchildindex=2*parentindex+1;
		rightchildindex=2*parentindex+2;
		}
		return ans.data;
		
	}
	public void Insert_minheap_upheapify(T data,int priority)
	{
		Element<T> x=new Element<T>(data,priority);
		heap.add(x);
		int childindex=heap.size()-1;
		int parentindex=(childindex-1)/2;
		while(childindex > 0)
		{
		if(heap.get(childindex).priority < heap.get(parentindex).priority)
		{
			Element<T> temp=heap.get(parentindex);
			heap.set(parentindex,heap.get(childindex));
			heap.set(childindex,temp);
		}
		else
		{
			return;
		}
		childindex=parentindex;
		parentindex=(childindex-1)/2;
		}
		
	}
}