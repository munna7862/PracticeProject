package strings;

public class FreqofChar {
	public static void main(String[] args) {
		String s = "Picture Perfect";
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='0')
				{
					count++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0' && ch[i]!=' ')
				System.out.print(ch[i]+" - "+count+" || ");
		}
	}
}
