class Demo{
	static int fibonacci(int n){
		if(n<=1){
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args){
		int fibonacci_no = fibonacci(8);
		System.out.println(fibonacci_no);
	}
}
