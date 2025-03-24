class MyNode{
	int data;
	MyNode next;
}
class MyLinkedList{
	MyNode head = null;
	private MyNode previous = null;
	private int count = 0;
	public void insert(int data){
		MyNode node = new MyNode();
		node.data = data;
		node.next = null;
		if(count==0){
			head = node;
		}else{
			previous.next = node;
		}
		previous = node;
		count++; 
	}
	public int getSize(){
		return count;
	}
	public void printList(){
		for(MyNode i = head;i!=null;i=i.next){
			System.out.print(i.data+" --> ");
		}System.out.println("null");
	}
	public void deleteNode(int target){
		boolean targetfound = false;
		for(MyNode i = head;i!=null;i=i.next){
			if(i.next!=null && i.next.data==target){
				i.next = i.next.next;
				targetfound = true;
				break;
			}else if(head.data==target){
				head = head.next;
				targetfound = true;
				break;
			}
			
		}
		if(!targetfound)
			System.out.println("No such element found for deletion : "+target);
	}
}
class Demo{
	public static void main(String[] args){
		MyLinkedList obj1 = new MyLinkedList();
		obj1.insert(10);	
		obj1.insert(20);	
		obj1.insert(30);	
		obj1.insert(40);
		System.out.println(obj1.getSize());
		System.out.println(obj1.head.data);
		obj1.printList();	
		obj1.deleteNode(30);
		obj1.printList();
		obj1.deleteNode(50);
		obj1.deleteNode(10);
		obj1.printList();	
	}
}
