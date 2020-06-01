package collections;

import java.util.TreeSet;

public class TreeSetE {

	public static void main(String[] args) {
		TreeSet<B> h = new TreeSet<B>();
		B obj1 = new B(40,40);
		B obj2 = new B(20,40);
		B obj3 = new B(30,40);
		B obj4 = new B(40,50);
		
		h.add(obj1);
		h.add(obj2);
		h.add(obj3);
		h.add(obj4);
		
		for(B i:h)
		{
			System.out.println(i.add());
		}
	}

}
