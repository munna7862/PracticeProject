package collections;

import java.util.ArrayList;
public class ArrayListE {
	
	public static void main(String[] args) {
		ArrayList<A> a = new ArrayList<A>();
		A obj1 = new A(1,20);
		A obj2 = new A(2,30);
		A obj3 = new A(3,40);
		A obj4 = new A(4,50);
		
		a.add(obj1);
		a.add(obj2);
		a.add(obj3);
		a.add(obj4);

		for(int j=0; j<a.size();j++)
		{
			System.out.println(a.get(j).add());
		}
	}

}
