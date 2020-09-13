
public class recurssion {
	public int arr[] = new int[8];
	public int fib_recurrive(int n)
	{
		if (n<= 1)
			return n;
		else
			return fib_recurrive(n-1) + fib_recurrive (n-2);
		
	}
	
	
	public int fib_dynamic_memoization( int n )
	{ 

		if ( arr[n] == 0  )
			if (n <= 1)
				arr[n]= 1;
			else
				arr[n] = fib_dynamic_memoization(n -1 ) + fib_dynamic_memoization(n-2);
		return arr[n];
	}
	public int fib_dynamic_tabulation( int n)
	{
		arr[0] = 0 ;
		arr[1] = 1 ;
		for(int i = 2 ; i<n ; i++)
			arr[n] = arr[n-1] + arr[n-2];
		return arr[n];
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		recurssion recsd = null;
		System.out.println(recsd instanceof recurssion);
		recurssion rec = new recurssion();
		int num = 8 ;
		System.out.println(rec.fib_recurrive(num));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		startTime = System.nanoTime();
		int arr[] = new int[num];
		for (int i:arr)
			arr[i] = 0;
		System.out.println(rec.fib_dynamic_memoization(num-1));
		endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		startTime = System.nanoTime();
		int arr_new[] = new int[num];
		for (int i:arr_new)
			arr_new[i] = 0;
		System.out.println(rec.fib_dynamic_tabulation(num-1));
		endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
}
