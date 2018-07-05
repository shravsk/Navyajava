package arrays;

public class LargestElement {
public static void main(String[] args) {
	int a[]={9,10,23,51,5};
	int key=0;
	for(int i=0;i<a.length;i++)
	{
		if(key<a[i])
		{
			key=a[i];
		}
	}
	System.out.println("largest value of the given array is "+ key);
}
}
