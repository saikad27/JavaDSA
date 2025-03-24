class Queue{
	int[] arr;
	int front;
	int rear;
	int maxSize;
	Queue(int size){
		arr = new int[size];
		front = -1;
		rear = -1;
		maxSize = size;
	}
	boolean isEmpty(){
		if(rear==-1)
			return true;
		else 
			return false;
	}
	void enque(int data){
		rear++;
		if(front==-1){
			front++;
		}
		if(rear<maxSize){	
			arr[rear] = data;	
		}else{
			rear--;
			System.out.println("Queue is Full");
		}
	}
	int front(){
		return arr[front];
	}
	int deque() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty");
		}
		int firstElement = arr[front];
		for(int i=1;i<=rear;i++){
			arr[i-1] = arr[i];
		}
		rear--;
		return firstElement;
	}
	public String toString(){
		return getString(front);
	}
	String getString(int i){
		if(i>rear){
			return "";
		}
		
		return arr[i]+", "+getString(i+1);
	}
}
class Demo{
	public static void main(String[] args)throws Exception{
		Queue queue = new Queue(5);
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		System.out.println(queue);
		System.out.println(queue.front());
		System.out.println(queue);
		System.out.println(queue.deque());
		System.out.println(queue);
		System.out.println(queue.deque());
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		queue.enque(40);
		queue.enque(50);
		queue.enque(60);
		queue.enque(70);
		System.out.println(queue);
		
	}
}
