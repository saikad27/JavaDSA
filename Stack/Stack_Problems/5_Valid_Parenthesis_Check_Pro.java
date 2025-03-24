import java.util.*;
class ParenthesisCheck{
	boolean check(char[] arr){
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<arr.length;i++){
			char ch = arr[i];
			if(ch=='{' || ch=='[' || ch=='('){
				stack.push(ch);
			}else{
				if(stack.empty()){
					return false;
				}else{
					char x = stack.peek();
					if(((x=='{')&&(ch=='}'))||((x=='[')&&(ch==']'))||((x=='(')&&(ch==')'))){
						stack.pop();	
					}else{
						return false;
					}
				}
			}
		}
		if(stack.empty())
			return true;
		else{
			return false;
		}
	}
}
class Demo{
	public static void main(String[] args){
		System.out.print("Enter parenthesis string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		ParenthesisCheck obj = new ParenthesisCheck();
		boolean checkFlag = obj.check(arr);
		if(checkFlag == true){
			System.out.println("Valid Parenthesis");
		}else{
			System.out.println("Invalid Parenthesis");
		}
	}
}
