
//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(0);
		l1.next.next = new ListNode(1);
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(5);
		Solution obj = new Solution();
		ListNode list = obj.addTwoNumbers(l1,l2);
		for(ListNode l3 = list; l3!=null;l3=l3.next){
			System.out.print(l3.val+"->");
		}
	}
    	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int size1 = 0;
		int size2 = 0;
		for(ListNode i=l1;i!=null;i=i.next){
			size1++;
		}
		for(ListNode i=l2;i!=null;i=i.next){
			size2++;
		}
		System.out.println(size1);
		System.out.println(size2);
		char[] num1 = new char[size1];
		char[] num2 = new char[size2];
		ListNode tempNode1 = l1;
		ListNode tempNode2 = l2;
		 
		//Filling char array 1
		for(int i=0;i<size1;i++){
			num1[i] = (char)tempNode1.val;
			tempNode1 = tempNode1.next;
		}
		//Filling char array 2
		for(int i=0;i<size2;i++){
			num2[i] = (char)tempNode2.val;
			tempNode2 = tempNode2.next;
		}
		//Reversing char array 1
		for(int i=0;i<(size1/2);i++){
			char temp = num1[i];
			num1[i] = num1[size1-i-1];
			num1[size1-i-1] = temp;
		}
		//Reversing char array 2
		for(int i=0;i<(size2/2);i++){
			char temp = num2[i];
			num2[i] = num2[size2-i-1];
			num2[size2-i-1] = temp;
		}
		
		int size3;
		if(size1>size2)
			size3 = size1;
		else
			size3 = size2;
    		char[] sum = new char[size3];
		int carry = 0;
		int i = size1-1;
		int j = size2-1;
		int k = size3-1;
		for(int p = 0;p<size1;p++){
			System.out.print((int)num1[p]+" ");
		}System.out.println();
		for(int p = 0;p<size2;p++){
			System.out.print((int)num2[p]+" ");
		}System.out.println();
		while(i>=0 && j>=0){	
			int box = num1[i]+num2[j]+carry;
			if(box-10>=0){
				carry = 1;
				box = box-10;
			}else{
				carry = 0;
			}
			sum[k] = (char)box;
			i--;
			j--;
			k--;
		}
		while(i>=0){
			int box = num1[i]+carry;
			if(box-10>=0){
				carry = 1;
				box = box-10;
			}else{
				carry = 0;
			}
			sum[k] = (char)box;
			i--;
			k--;
		}
		while(j>=0){
			int box = num2[j]+carry;
			if(box-10>=0){
				carry = 1;
				box = box-10;
			}else{
				carry = 0;
			}
			sum[k] = (char)box;
			j--;
			k--;
		}
		for(int z = 0;z<size3;z++){
			System.out.print((int)sum[z]+" ");
		}System.out.println();
		ListNode list = new ListNode(sum[size3-1]);
		list.next = null;
		ListNode head = list;
		for(int x=size3-2;x>=0;x--){
			ListNode newNode =  new ListNode();
			newNode.val = sum[x];
			newNode.next = null;
			list.next = newNode;
			list = list.next;
		
		}
		if(carry!=0){
			list = list.next;
			list.val = carry;
			list.next = null;
		}else{
			
		}
		return head;
	}
		
}
