package arrays;

public class ThirdLargest {
public static void main(String[] args) {
	int a[]={7,10,23,51,24,5};
	/*int[] a={1,2,3,4,5,6,7,8,9};*/
	/*int[] a={1,9,2,8,3,6,10,38,25};*/
	int fbig=a[0];
	int sbig=0;
	int tbig=0;
	for(int i=1;i<a.length;i++)
	{
		if(fbig<a[i])
		{
			tbig=sbig;
			sbig=fbig;
			fbig=a[i];
		}
		else if((sbig<a[i])&&(fbig!=a[i]))
		{
			tbig=sbig;
			sbig=a[i];
		}
		else if((tbig<a[i])&&(sbig!=a[i]))
		{
			tbig=a[i];
		}
	}
	System.out.println("Third biggest value is "+tbig);
}
}
