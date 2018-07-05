package arrays;

public class SecondlargestEle {
public static void main(String[] args) {
	int a[]={7,10,23,51,24,5};
	int fbig=a[0];
	int sbig=0;
	for(int i=1;i<a.length;i++)
	{
		if(fbig<a[i])
		{
			sbig=fbig;
			fbig=a[i];
		}
		else if(sbig<a[i])
		{
			sbig=a[i];
		}
	}
	System.out.println("second biggest value is "+sbig);
}
}
