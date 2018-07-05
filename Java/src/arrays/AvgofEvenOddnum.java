package arrays;

public class AvgofEvenOddnum {
public static void main(String[] args) {
	int a[]={1,2,3,4,5,6};
	double eavg=0,oavg=0;
	int esum=0,osum=0;
	int ecount=0,ocount=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			esum=esum+a[i];
			ecount++;
		}
		else
		{
			osum=osum+a[i];
			ocount++;
		}
		
	}
	eavg=esum/ecount;
	oavg=osum/ocount;
	System.out.println(eavg);
	System.out.println(oavg);
}
}
