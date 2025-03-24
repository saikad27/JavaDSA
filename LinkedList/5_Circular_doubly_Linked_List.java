import java.util.Scanner;
class Node{
	int data;
	Node next = null;
	Node prev = null;
	Node(int data){
		this.data = data;
	}
}
//Doubly Circular Linked-List
class LinkedList{
	Node head = null;
	//1 Done
	void addFirst(int data){
		Node node = new Node(data);
		if(head==null){
			head = node;
			node.prev = head;
			node.next = head;	
		}else{
			node.prev = head.prev;
			node.next = head;
			head.prev.next = node;
			head.prev = node;
			head = node;
		}
		System.out.println("Node added successfully");
	}
	//2 Done
	void deleteFirst(){
		if(head==null){
			System.out.println("Nothing to delete");
			return;
		}else if(size()==1){
			head = null;		
		}else{
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
		}
		System.out.println("Node deleted successfully");
	}
	//3 Done
	void printList(){
		if(head==null){
			System.out.println("Linked List is empty");
		}else{
			Node temp = head;
			while(temp.next!=head){
				System.out.print(temp.data+" <=> ");
				temp = temp.next;
			}System.out.println(temp.data);
		}
	}
	//4 Done
	void addLast(int data){
		Node node = new Node(data);
		if(head==null){
			head = node;
			node.next = head;
			node.prev = head;
		}
		else{	
			node.prev = head.prev;
			node.next = head;
			node.prev.next = node;
			node.next.prev = node;
		}
		System.out.println("Node added successfully");
	}
	//5 Done
	void deleteLast(){
		if(head==null){
			System.out.println("Linked List is empty, nothing to delete");
			return;
		}else if(size()==1){
			head = null;
		}else{
			head.prev = head.prev.prev;
			head.prev.next = head;
		}
		System.out.println("Node deleted successfully");
	}
	void addAtPos(int data,int pos){
		if(pos<=0 || pos>size()+1){
                        System.out.println("Invalid position, try again");
                }else if(pos==1){
			addFirst(data);
		}else if(pos==size()+1){
			addLast(data);
		}else{
			Node node = new Node(data);
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			node.prev = temp;
			node.next = temp.next;
			node.prev.next = node;
			node.next.prev = node;
			System.out.println("Node added successfully");
		}
	}
	void deleteAtPos(int pos){
		if(pos<1 || pos>size()){
                        System.out.println("Invalid position, try again");
                }else if(pos==1){
			deleteFirst();
		}else if(pos==size()){
			deleteLast();
		}else{
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
			System.out.println("Node deleted successfully");
		}
	}
	int size(){
		if(head==null){
			return 0;
		}else{
			Node temp = head;
			int count = 0;
			while(temp.next!=head){
				count++;
				temp = temp.next;
			}
			count++;
			return count;
		}	
	}
}
class Demo{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do{			
			System.out.println("\n\n*********_Linked_List_Operations_Menu_**********\n");
			System.out.println("1 : Add first");
			System.out.println("2 : Delete first");
			System.out.println("3 : Add last");
			System.out.println("4 : Delete last");
			System.out.println("5 : Add at Position");
			System.out.println("6 : Delete at Position");
			System.out.println("7 : Print size");
			System.out.println("8 : Print Linked list");
			System.out.println("-------------------------------------------------\n\n");
			System.out.print("Enter your choice : ");
			int n = sc.nextInt();
			switch(n){
				case 1 : 
					System.out.print("Enter data : ");
					ll.addFirst(sc.nextInt());
					break;
				case 2 : ll.deleteFirst();
					break;
				case 3 : System.out.print("Enter data : ");
					ll.addLast(sc.nextInt());
					break;
				case 4 : ll.deleteLast();
					break;
				case 5 : 
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					System.out.print("Enter position : ");
					int pos = sc.nextInt();
					ll.addAtPos(data,pos);
					break;
				case 6 : System.out.print("Enter position : ");
					ll.deleteAtPos(sc.nextInt());
					break;
				case 7 : System.out.println(ll.size());
					break;
				case 8 : ll.printList();
					break;
			}
			System.out.print("Enter Y or y to continue : ");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}

