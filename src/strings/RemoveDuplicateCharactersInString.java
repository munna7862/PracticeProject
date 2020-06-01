package strings;

public class RemoveDuplicateCharactersInString {
	public static void main(String[] args) {
		String s = "abccbdbsaab";
		char ch[] = s.toCharArray();
		String s1 = "";
		System.out.print("Duplicate characters are: ");
		for(int i=0;i<s.length();i++)
		{
			int count = 1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='0')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1&&ch[i]!='0')
			{
				System.out.print(ch[i]+" ");
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]!='0')
			{
				s1=s1+ch[i];
			}
		}
		System.out.println("\n\nAfter Removing Duplicate Characters: "+s1);
	}
}
