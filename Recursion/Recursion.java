class Recursion{
	static int count = 0;
	static void fun(){
		count++;
		System.out.println("In fun");
		if(count<10){
			fun();	
		}
		
	}
	public static void main(String[] args){
		fun();
	}
}
