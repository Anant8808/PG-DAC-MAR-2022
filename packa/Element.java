package packa;
import java.util.*;

public class Element<T>
{
	T data;
	int priority;
	public Element(T data,int priority)
	{
		this.data=data;
		this.priority=priority;
	}
}