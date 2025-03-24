class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
		System.out.println("Node created successfully with data : "+this.data);
	}
}
class LL{
	int size = 0;
	Node head = null;
	 
	void addFirst(int data){
		size++;
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
	
		System.out.println("Node added successfully");
		
	}
	void printLinkedList(){
		Node currNode = head;
		while(currNode!=null){
			System.out.print("["+currNode.data+"] -> ");
			currNode = currNode.next;
		}
	}
	
}
class Demo{
	public static void main(String[] args){
		LL ll = new LL();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.printLinkedList();	
	}
}
