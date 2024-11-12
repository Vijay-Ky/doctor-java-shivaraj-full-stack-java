public class K
{
	public static void main(String[] args)
	{
		int[] x, y, z;
		x = new int[2];
		y = new int[20];
		z = new int[12];
		
		for(int i : x)
		{
			System.out.println(x[i]);
		}
		System.out.println("-----------------------");
		for(int i : y)
		{
			System.out.println(y[i]);
		}
		System.out.println("-----------------------");
		for(int i : z)
		{
			System.out.println(z[i]);
		}
	}
}
