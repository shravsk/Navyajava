package arrays;

public class ZigZag {
public static void main(String[] args) {
	int[] a1={1,2,3};
	int[] a2={4,5,6,7,8,9};
	int[] a3=new int[a1.length+a2.length];
	int k=0;
	int i;
	for(i=0;i<a1.length&&i<a2.length;i++)
	{
		a3[k]=a1[i];
		k++;
		a3[k]=a2[i];
		k++;
	}
	while(i<a2.length)
	{
		a3[k]=a2[i];
		k++;
		i++;
	}
	for(i=0;i<a3.length;i++)
	{
		System.out.print(a3[i]+" ");
	}
	
}
}
