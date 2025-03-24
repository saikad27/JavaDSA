class StringReverse{
	public static void main(String[] args){
		String str = "core2web";
		StringBuffer newString = new StringBuffer("core2web");
		for(int i=0;i<str.length()/2;i++){
			char temp = newString.charAt(i);
			newString.setCharAt(i,newString.charAt(str.length()-i-1));
			newString.setCharAt(str.length()-i-1,temp);
		}
		System.out.println(newString);
	}
}
