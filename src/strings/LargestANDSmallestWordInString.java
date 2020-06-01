package strings;

import java.util.Arrays;

public class LargestANDSmallestWordInString {

	public static void main(String[] args) {
		String s = "Hardships often prepare ordinary people for an extraordinary destiny";
		String sp[] = s.split(" ");
		int l[] = new int[sp.length];
		for(int i=0;i<sp.length;i++)
		{
			l[i] = sp[i].length();
		}

		int c=0,c1=0;
		Arrays.sort(l);

		for(int i=0;i<l.length;i++)
		{
			c1 = l[0];
			c = l[l.length-1];
		}

		for(int i=0;i<sp.length;i++)
		{
			if(sp[i].length()==c)
			{
				System.out.println("Largest Word is: "+sp[i]);
			}
			if(sp[i].length()==c1)
			{
				System.out.println("Smallest Word is: "+sp[i]);
			}
		}
	}
}
