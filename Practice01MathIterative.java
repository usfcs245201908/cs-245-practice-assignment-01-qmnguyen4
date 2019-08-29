public interface Practice01MathIterative	 {
	
	public int fact (int n) throws Exception;{
		int product = 1;
  		for ( int j=1; j<=N; j++ )
    	product *= j;
  		return product; 

}

	
	public int fib (int n) throws Exception;{

		
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
		
	}
}