package strings;

public class RemoveDupicateElements {
	public static void main(String[] args) {
		int c[] = {1,2,5,1,5,2,3,6,1};
		System.out.print("Duplicate Elements are: ");
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j]&&c[i]!=' ')
				{
					count++;
					c[j]='0';
				}
			}
			if(count>1 && c[i]!='0')
				System.out.print(c[i]+" ");
		}
		System.out.print("\n\nAfter Removing Duplicate elements: ");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='0')
			{
				System.out.print(c[i]+" ");
			}
		}
	}
}
