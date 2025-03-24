class StringReverse2{
	public static void main(String[] args){
		String str = "core2web";
		StringBuffer str2 = new StringBuffer(str);
		for(int i=str.length()-1;i>=str2.length()/2;i--){
			char ch = str2.charAt(i);
			str2.setCharAt(i,str2.charAt(str2.length()-i-1));
			str2.setCharAt(str2.length()-i-1,ch);
		}
		System.out.println(str2);
	}
}
