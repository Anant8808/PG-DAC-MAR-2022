import java.util.*;
class ReverseLinkedList
{
	Node head;
	    class Node
		{
			int data;
			Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
		}
		public void inserthead(int d)
		{
			Node temp=new Node(d);
			if(head==null)
			{
				head=temp;
			}
		}
		
		public void callreverse()
		{
			Node head=reverse();
		}
		public void insertEnd(int d)
		{ 
		       if(head==null)
			   {
				   inserthead(d);
				   return;
			   }
		    Node temp=new Node(d);
            Node six=head;
			while(six.next!=null)
			{
				six=six.next;
			}
			
		   six.next=temp;
			
		}
		public Node reverse()
		{
			Node prev=null;
			Node curr=head;
			Node temp=null;
			while(curr!=null)
			{
				temp=curr.next;
				curr.next=prev;
				prev=curr;
				curr=temp;
				
			}
			head=prev;
			return head;
			
		}
		public void display()
		{
			Node ptr=head;
			while(ptr!=null)
			{
				System.out.print(ptr.data+" ");
				ptr=ptr.next;
			}
		}
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			ReverseLinkedList p=new ReverseLinkedList();
			System.out.println("Enter the no of testcases");
			int t=sc.nextInt();
			while(t>0)
			{
				System.out.println("Enter the no of elements in linked list");
				int no=sc.nextInt();
				for(int i=1;i<=no;i++)
				{
					int x=sc.nextInt();
					p.insertEnd(x);
				}
				System.out.println("Output:");
				p.reverse();
				p.display();
				System.out.println();
				t--;
			}
			
		}
}