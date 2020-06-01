package strings;

public class AllPossibleSubSetOfStrings {
	public static void main(String[] args) {
		String s = "FUNA";
		int n= s.length();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
			sb.append(s.substring(i, j+1)+" ");
			}
			sb.append(" ");
		}
		
		System.out.println(sb);
	}

}
