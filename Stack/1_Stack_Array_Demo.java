import java.util.EmptyStackException;
import java.util.Scanner;
class Stack{
	int top = -1;
	int size;
	int[] stackArr;
	Stack(int size){
		this.size = size;
		stackArr = new int[size];
		System.out.println(stackArr.length);
	}
	void push(int data){
		if(top==size-1){
			throw new StackOverflowError();
		}else{
			top++;
			stackArr[top] = data;
		}
	}
	int pop(){
		int val = 0;
		try{
			val = stackArr[top];
			top--;
			return val;
		}catch(Exception e){
			throw new EmptyStackException();
		}
	}
	int peek(){
		try{
			return stackArr[top];
		}catch(Exception e){
			throw new EmptyStackException();
		}
	}
	int size(){
		return top+1;
	}
	
	public String toString(){
		if(top==-1){
			return "[ ]";
		}
		else{
			return getData(0);
		}
	}
	String getData(int i){
		
		if(i==top+1){
			return "]";
		}
		if(i==0)
			return "["+stackArr[i]+getData(i+1);
		else
			return ","+stackArr[i]+getData(i+1);
	}
	
	boolean empty(){
		if(top==-1){	
			return true;
		}
		else{
			return false;
		}
	}	
	
}
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter stack size : ");
		Stack obj = new Stack(sc.nextInt());
		int x = 0;
		do{
			System.out.println("*********STACK_OPERATION_MENU**********");
			System.out.println("1.push");
			System.out.println("2.peek");
			System.out.println("3.pop");
			System.out.println("4.print stack");
			System.out.println("5.empty");
			System.out.println("6.size");
			System.out.println("0.exit");	
			System.out.println("***************************************\n");
			System.out.print("Enter your choice : ");
			x = sc.nextInt();
			
			switch(x){
				
				case 0 : 	break;
				
				case 1 : 	int data;
						System.out.print("Enter data : ");
						data = sc.nextInt();
						obj.push(data);
						break;
				
				case 2 : 	System.out.println(obj.peek());
						break;
				
				case 3 : 	System.out.println(obj.pop());
						break;
				
				case 4 : 	System.out.println(obj);
						break;
				
				case 5 :	System.out.println(obj.empty());
						break;

				case 6 : 	System.out.println(obj.size());
						break;
				
				default : 	x = 0;	
			}

		}while(x!=0);
	}
}
