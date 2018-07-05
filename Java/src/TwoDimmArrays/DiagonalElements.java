package TwoDimmArrays;

import java.util.Scanner;

public class DiagonalElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the row");
	int row=sc.nextInt();
	System.out.println("enter the size of the column");
	int column=sc.nextInt();
	int a[][]=new int[row][column];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Display elements...");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			if(i==j)
			{
			System.out.print(a[i][j]+" ");
			}
			else if(i!=j)
			{
				System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
 }
}
