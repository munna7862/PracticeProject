package strings;

public class MINandMAXoccurenceCharacter {
	public static void main(String[] args) {
		String s = "grass is greener on the other side";
		char ch[] = s.toCharArray();
		int l[] = new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			l[i] = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[j]!='0')
				{
					l[i]++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0'&&ch[i]!=' ')
			{
				System.out.print(ch[i]+" - "+l[i]+" || ");
			}
		}
		int max=l[0],min=l[0];
		char maxchar=' ',minchar=' ';
		for(int i=0;i<l.length;i++)
		{
			if(l[i]>max && ch[i]!='0')
			{
				max = l[i];
				maxchar = ch[i];
			}
			if(l[i]<min && ch[i]!='0')
			{
				min = l[i];
				minchar = ch[i];
			}
			
		}
		System.out.println("\nMax count: "+max+" & its char: "+maxchar+" Min count: "+min+" & its char: "+minchar);
	}
}
