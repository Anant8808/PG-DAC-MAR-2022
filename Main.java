package packa;
import java.util.*;

public class Main
{
	public static void main(String args[])throws PriorityQueueEmptyException
	{
		Priority<String> pq= new Priority<>();
		pq.Insert_minheap_upheapify("P1",10);
        pq.Insert_minheap_upheapify("P2",8);
        pq.Insert_minheap_upheapify("P3",12);
		pq.display();
       //System.out.print(pq.Removemin_downheapify());		
	}
}