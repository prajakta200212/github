public class SwapBitwise
{
	public static void main(String x[])
	{
		
		int a=5,b=6,c;
			
	System.out.printf("before Swapping\n");
	System.out.printf("A=%d\tb=%d\n",a,b);
	
	a=a^b;
	b=a^b;
	a=a^b;
	
	System.out.printf("after Swapping\n");
	System.out.printf("A=%d\tb=%d\n",a,b);
	}
}