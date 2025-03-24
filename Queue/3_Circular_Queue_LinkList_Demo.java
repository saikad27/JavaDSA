import java.util.Scanner;
class CircularQueue{
	int[] queueArr;
	int front;
	int rear;
	int maxSize;
	CircularQueue(int size){
		this.queueArr = new int[size];
		this.maxSize = size;
		this.front = -1;
		this.rear = -1;
	}
	void enqueue(int data)throws Exception{
		int prevRear = rear;
		rear++;
		rear = rear%maxSize;
		if(front==rear){
			rear = prevRear;
			throw new Exception("Queue is full, could not add element");
		}
		queueArr[rear] = data;
		if(front==-1)
			front++;
	}
	int dequeue()throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty, could not remove element");
		}
		if(front==rear){
			int element = queueArr[front];
			front = rear = -1;
			return element;
		}
		int element = queueArr[front];
		front++;
		front = front%maxSize;
		return element;
	}
	boolean isEmpty(){
		if(front==-1)
			return true;
		else 
			return false;
	}
	int front()throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty, there's no front element");
		}
		return queueArr[front];
	}
	void displayQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty, nothing to display");
			return;
		}
		int temp = front;
		while(temp!=rear){
			System.out.print(queueArr[temp]+"<-");
			temp++;
			temp = temp%maxSize;
		}System.out.println(queueArr[temp]);
	}
}
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of queue : ");
		int size = sc.nextInt();
		CircularQueue queue = new CircularQueue(size);
		int choice = 0;
		do{
			System.out.println("\n\n********* Circular Queue operations **********");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Front");
			System.out.println("4.Check if Empty?");
			System.out.println("5.Display");
			System.out.println("0.Exit");
			System.out.print("\n\nEnter your choice:");
			choice = sc.nextInt();
			switch(choice){
				case 0 : {
						break;
					 }
				case 1 : {
						try{
							System.out.print("Enter data : ");
							queue.enqueue(sc.nextInt());
						}catch(Exception e){
							System.out.println(e);
						}
							break;
			  		 }
				case 2 : {	try{
						System.out.println("Element deleted successfully : "+queue.dequeue());
						}catch(Exception e){
							System.out.println(e);
						}
						break;
					 }
				case 3 : {	try{
							System.out.println("First element in queue : "+queue.front());
						}catch(Exception e){
							System.out.println(e);
						}
						break;
					 }
				case 4 : {
						if(queue.isEmpty())
							System.out.println("Queue is empty");
						else 
							System.out.println("Queue is not empty");
						break;
					}
				case 5 : {
						queue.displayQueue();
						break;
					 }
				default : {
						System.out.println("Invalid choice, please try again");
					  }
			}

		}while(choice !=0);
	}
}
