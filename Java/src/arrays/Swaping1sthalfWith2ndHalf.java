package arrays;

public class Swaping1sthalfWith2ndHalf {
public static void main(String[] args) {
	int a[]={1,2,3,4,5,6,7,8};
	int start=0;
	int temp=0;
	int end=a.length-1;
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	while(start<end )
	{
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
	System.out.println("Displaying elements...");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
}
