import java.util.Scanner;
class TwoStack{
	int[] stackArr;
	int top1;
	int top2;
	int max;
	TwoStack(int size){
		this.stackArr = new int[size];
		top1 = -1;
		top2 = size;
		max = size;
	}
	void pushStack1(int data){
		if((top2-top1)>1){
			top1++;
			stackArr[top1] = data;
		}else{
			System.out.println("Stack is full");
			return;
		}
		System.out.println("Data push successful");
	}
	void pushStack2(int data){
		if((top2-top1)>1){
			top2--;
			stackArr[top2] = data;
		}else{
			System.out.println("Stack is full");
			return;
		}
		System.out.println("Data push successful");
	}
	int popStack1(){
		if(top1>-1){
			return stackArr[top1--];
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	int popStack2(){
		if(top2<max){
			return stackArr[top2++];
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
}
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		TwoStack obj = new TwoStack(size);
		int choice = 0;
		do{
			System.out.println("\n************ Two_Stack Operation Menu *************");
			System.out.println("1.Push data in Stack 1");
			System.out.println("2.Push data in Stack 2");
			System.out.println("3.Pop data from Stack 1");
			System.out.println("4.Pop data from Stack 2");
			System.out.println("5.Exit");
			System.out.print("\nEnter your choice : ");
			choice = sc.nextInt();
			switch(choice){
				case 1 :{ 	System.out.print("Enter data : ");
						int data = sc.nextInt();
						obj.pushStack1(data);
						break;
					}	
				case 2 :{	System.out.print("Enter data : ");
                                                int data = sc.nextInt();
                                                obj.pushStack2(data);
                                                break;
					}
				case 3 : 	System.out.println(obj.popStack1());
						break;
		
				case 4 : 	System.out.println(obj.popStack2());
						break;
				
				case 5 : 	break;
			
				default : 	System.out.println("Invalid choice entered");

			}

		}while(choice!=5);
	}
}
