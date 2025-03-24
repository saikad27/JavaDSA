import java.util.Scanner;
class Node{
	int data;
	Node next = null;
	Node previous = null;
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
			head.previous = node;
			head = node;
		}
	}
	void deleteFirst(){
		if(head==null){
			System.out.println("Nothing to delete");
		}else{
			head = head.next;
			head.previous = null;
		}
	}
	void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}System.out.println();
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
			node.previous = temp;
			temp.next = node;
		}
	}
	void addAtPos(int data,int pos){
		Node node = new Node(data);
		if(pos==1){
			addFirst(data);
		}else if(pos==size()+1){	
			addLast(data);
		}else if(pos<1 || pos>size()+1){
			System.out.println("Invalid position");
		}else{
			int count = 1;
			Node temp = head;
                        while(count<pos){
				count++;
                                temp = temp.next;
                        }
			temp.previous.next = node;
			node.previous = temp.previous;
			node.next = temp;
			temp.previous = node;
		}
	}
	void deleteAtPos(int pos){
		if(pos==1){
			deleteFirst();
		}else if(pos==size()){	
			deleteLast();
		}else if(pos<1 || pos>size()){
			System.out.println("Invalid position");
		}else{
			int count = 1;
			Node temp = head;
                        while(count<pos){
				count++;
                                temp = temp.next;
                        }
			temp.previous.next = temp.next;
			temp.next.previous = temp.previous;
			temp.next = null;
			temp.previous = null;
		}
		
	}
	void deleteLast(){
		if(head==null){
			System.out.println("Nothing to delete");
		}else{	
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.previous.next = null;
			temp.previous = null;
		}	
	}
	int size(){
		int count = 0;
		Node temp = head;
                while(temp!=null){
			count++;
                        temp = temp.next;
                }
		return count;
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
