import java.util.Scanner;
class Node{
	int data;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}

class LinkedList{
	Node head = null;
	void addFirst(int data){
		Node node = new Node(data);
		if(head==null){
			head = node;
		}else{
			node.next = head;
			head = node;
		}
		System.out.println("Node added successfully");
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
		System.out.println("Node added successfully");
	}
	void deleteLast(){
		if(head==null){
			System.out.println("Nothing to delete");
		}else{
			Node temp = head;
			while(temp.next.next!=null){
				temp = temp.next;
			}
			temp.next = null;
		}System.out.println("Node deleted successfully");

	}
	void addAtPos(int data,int pos){
		if(pos==1){
			addFirst(data);
		}else if(pos==size()+1){
			addLast(data);
		}else if(pos<1 || pos>size()+1){
			System.out.println("Invalid position");
		}else{
			Node node = new Node(data);
			Node temp = head;
			int count = 1;
			while(count<pos-1){
				temp = temp.next;
				count++;
			}
			node.next = temp.next;
			temp.next = node;
		}
		System.out.println("Node added successfully");
	}
	void deleteAtPos(int pos){
		if(pos==1){
			deleteFirst();
		}else if(pos==size()){
			deleteLast();
		}else if(pos<1 || pos>size()){
			System.out.println("Invalid position");
		}else{
			Node temp = head;
			int count = 1;
			while(count<pos-1){
				temp = temp.next;
				count++;
			}
			temp.next = temp.next.next;
		}
		System.out.println("Node deleted successfully");

	}
	int size(){
		int count = 0;
		Node temp = head;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
		temp = temp.next;
		}System.out.println();
	}
	void deleteFirst(){
		if(head==null){
			System.out.println("Nothing to delete");	
		}else{
			head = head.next;	
			System.out.println("Node deleted successfully");
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
			System.out.println("6 : Delet at Position");
			System.out.println("7 : Print size\n");
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
				case 7 : System.out.print(ll.size());
					break;
				case 8 : ll.printList();
					break;
			}
			System.out.print("Enter Y or y to continue : ");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
