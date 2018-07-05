package arrays;

public class PairofValues {
public static void main(String[] args) {
	int a[]={1,21,5,15,17,3,13,11,2,4};
	int sum=15;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==sum)
			{
				System.out.println("pair of values are "+a[i]+" "+a[j]);
			}
		}
	}
}
}
