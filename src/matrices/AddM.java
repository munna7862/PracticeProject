package matrices;

import java.util.Scanner;

public class AddM {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int c[][] = new int[3][3];
		/*System.out.println("Addition of Matrix: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Multiplication of Matrix: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<a.length;k++)
				{	
				c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}*/
		System.out.println("Transpose Matrix: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				//a[i][j] = a[j][i];
				System.out.print(a[j][i]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
