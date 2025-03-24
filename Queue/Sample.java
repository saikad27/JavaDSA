class Demo{
	void Demo(){
		System.out.println("In demo method");
	}
	Demo(){
		System.out.println("In demo constructor");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.Demo();		
	}
}
