package collections;

public class B implements Comparable<B> {
	int a;
	int b;

	public B(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int add()
	{
		return a+b;
	}
	
	public int compareTo(B obj) {
		if(a+b>obj.a+obj.b)
		{
			return 1;
		}
		else if(a+b<obj.a+obj.b)
		{
			return -1;
		}
		else
		return 0;
	}
}
