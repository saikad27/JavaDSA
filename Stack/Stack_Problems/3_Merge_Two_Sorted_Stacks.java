import java.util.Stack;
class Demo{
	public static void main(String[] args){
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();
	
		s1.push(10);
		s1.push(30);
		s1.push(50);
		System.out.println(s1);
		
		s2.push(20);
		s2.push(40);
		s2.push(60);
		s2.push(70);
		System.out.println(s2);

		s3 = mergeSortStacks(s1,s2,s3);
		System.out.println(s3);
	}
	static Stack<Integer> mergeSortStacks(Stack<Integer> s1,Stack<Integer> s2,Stack<Integer> s3){
		while(!(s1.empty()) && !(s2.empty())){
			if(s1.peek()>s2.peek()){
				s3.push(s1.pop());
			}else{
				s3.push(s2.pop());
			}
		}
		while(!(s1.empty())){
			s3.push(s1.pop());
		}
		while(!(s2.empty())){
			s3.push(s2.pop());
		}
		System.out.println(s3);
		while(!(s3.empty())){
			s1.push(s3.pop());
		}
		return s1;
	}
}
