package collections;

import java.util.LinkedList;

public class LinkedListE {
	public static void main(String[] args) {
		LinkedList<A> l = new LinkedList<A>();
		A obj1 = new A(10,20);
		A obj2 = new A(20,30);
		A obj3 = new A(30,40);
		A obj4 = new A(40,50);
		
		l.add(obj1);
		l.add(obj2);
		l.add(obj3);
		l.add(obj4);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).add());
		}
	}
}
