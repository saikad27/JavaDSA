import java.util.Scanner;
class LinkedList{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	private Node head;
	LinkedList(){
		this.head = null;
	}
	void addFirst(int data){
		if(head==null){
			Node node = new Node(data);
			head = node;
		}else{
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
	}
	void addLast(int data){
		Node node = new Node(data);
		if(head==null){
			head = node;
		}else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	boolean isEmpty(){
		if(head==null)
			return true;
		else
			return false;
	}
	boolean deleteFirst(){
		if(isEmpty()){
			return false;	
		}else{
			head = head.next;
			return true;
		}
	}
	boolean deleteLast(){
		if(isEmpty())
			return false;
		else{
			Node temp = head;
			while(temp.next.next!=null){
				temp = temp.next;
			}
			temp.next = null;
			return true;
		}
	}
	int getHead(){
		return head.data;
	}
	void display(){
		Node temp = head;
		while(temp.next!=null){
			System.out.print(temp.data+"<-");
			temp = temp.next;
		}System.out.println(temp.data);
	}
}
class Queue{
	LinkedList queueList;
	int size = 0;
	Queue(){
		queueList = new LinkedList();
	}
	void enqueue(int data){
		queueList.addLast(data);
		size++;
	}
	int dequeue()throws Exception{
		if(size==0){
			throw new Exception("Queue is Empty");
		}
		int data = queueList.getHead();
		queueList.deleteFirst();
		size--;
		return data;
	}
	boolean isEmpty(){
		return queueList.isEmpty();
	}
	int front()throws Exception{
		if(size==0){
			throw new Exception("Queue is Empty");
		}
		return queueList.getHead();
	}
	void displayQueue(){
		if(size==0){
			System.out.println("Queue is Empty, nothing to display");
			return;
		}
		queueList.display();
	}
}
class Demo{
	public static void main(String[] args){
		Queue queue = new Queue();
		int choice = 0;
		do{
			System.out.println("\n\n********* Queue operations **********");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Front");
			System.out.println("4.Check if Empty?");
			System.out.println("5.Display");
			System.out.println("0.Exit");
			System.out.print("\n\nEnter your choice:");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice){
				case 0 : {
						break;
					 }
				case 1 : {
						System.out.print("Enter data : ");
						queue.enqueue(sc.nextInt());
						break;
			  		 }
				case 2 : {	try{
						System.out.println("Element deleted successfully : "+queue.dequeue());
						}catch(Exception e){
							System.out.println("Queue is empty");
						}
						break;
					 }
				case 3 : {	try{
							System.out.println("First element in queue : "+queue.front());
						}catch(Exception e){
							System.out.println("Queue is empty");
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
