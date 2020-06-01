package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetE {

	public static void main(String[] args) {
		LinkedHashSet<A> h = new LinkedHashSet<A>();
		A obj1 = new A(30,20);
		A obj2 = new A(20,30);
		A obj3 = new A(30,40);
		A obj4 = new A(40,50);
		
		h.add(obj1);
		h.add(obj2);
		h.add(obj3);
		h.add(obj4);
		
		for(A i:h)
		{
			System.out.println(i.add());
		}
	}

}
