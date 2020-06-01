package strings;

public class SwappingTwoWordsWithout3rdVariable {

	public static void main(String[] args) {
		String s1 = "Good";
		String s2 = "Morning";
		System.out.println(s1+" "+s2);
		System.out.println("After Swaping: ");
		
		s1 = s1+s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println(s1+" "+s2);
		
	}

}
