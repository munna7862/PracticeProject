package strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementsUsingAL {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.print("Actual ArrayList: "+al);
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.addAll(al);
		System.out.print("\n\nWith LinkedHashSet: "+h+"\n");
		
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j)&&al.get(i)!=0)
				{
					count++;
					al.set(j, 0);
				}
			}
			if(count>1&&al.get(i)!=0)
			{
				System.out.println(+al.get(i));
			}
		}
		
		
	}

}
