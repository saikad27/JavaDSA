import java.util.*;
class ParenthesisCheck{
	boolean check(char[] arr){
		boolean checkFlag = true;
		if(arr.length%2==1){
			checkFlag = false;
			return checkFlag;
		}
		int i = 0;
		Stack<Character> stack = new Stack<Character>();
		while(i<(arr.length/2)){
			switch(arr[i]){
				case '{' : {	
						stack.push('}');	
						break;	
					   }
				case '[' : {
						stack.push(']');
						break;
					   }
				case '(' : {
						stack.push(')');
						break;
					   }
				default : {
						checkFlag = false;
						return checkFlag;
					  }
			}
			i++;
		}
		while(i<arr.length){
			if(arr[i]!=stack.pop()){
				checkFlag = false;
				return checkFlag;
			}
			i++;
		}
		return checkFlag;
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
