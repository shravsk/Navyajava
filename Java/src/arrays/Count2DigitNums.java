package arrays;

public class Count2DigitNums {
public static void main(String[] args) {
	int a[]={1,21,5,15,17,3};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>9&&a[i]<100)
		{
			count++;
		}
	}	
	System.out.println("count of 2 digit num is "+count);
}
}
