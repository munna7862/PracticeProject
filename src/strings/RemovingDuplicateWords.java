package strings;

public class RemovingDuplicateWords {

	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose";
		String sp[] = s.split(" ");
		System.out.print("Duplicate words are: ");
		for(int i=0;i<sp.length;i++)
		{
			int c=1;
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].equals(sp[j])&&sp[i]!="000")
				{
					c++;
					sp[j]="000";
				}
			}
			if(c>1&&sp[i]!="000")
			{
				System.out.print(sp[i]+" ");
			}
		}
		System.out.print("\n\nAfter removing duplicate words: ");
		for(int i=0;i<sp.length;i++)
		{
			if(sp[i]!="000")
			{
				System.out.print(sp[i]+" ");
			}
		}
	}

}
