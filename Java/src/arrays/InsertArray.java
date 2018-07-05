package arrays;

import java.util.Scanner;

public class InsertArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Display elements...");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
}
}
