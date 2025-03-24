import java.util.*;
class AddSum{
	public static void  main(String[] args){
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.addLast(2);
		l1.addLast(5);
		l1.addLast(6);
		l2.addLast(7);
		l2.addLast(0);
		l2.addLast(8);
		System.out.println(l1);//		[2,5,6]
		System.out.println(l2);//		[7,0,8]
		StringBuffer str1=new StringBuffer();
		StringBuffer str2=new StringBuffer();
		for(int i=l1.size()-1;i>=0;i--){
			str1.append(l1.get(i));
		}	
		for(int i=l2.size()-1;i>=0;i--){
			str2.append(l2.get(i));
		}
		System.out.println(str1);	
		System.out.println(str2);
		int x = Integer.parseInt(str1.toString());	
		int y = Integer.parseInt(str2.toString());	
		System.out.println(x);	
		System.out.println(y);	
		int z = x+y;
		int temp = z;
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		while(temp!=0){
			l3.addLast(temp%10);		
			temp /=10;	
		}
		System.out.println(l3);	
	}
	
}
