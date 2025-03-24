class Demo{
	static String stringReverse(String str){
		if(str.length()==1){
			return ""+str.charAt(0);
		}
		
		return stringReverse(str.substring(1))+str.charAt(0);

	}
	
	public static void main(String[] args){
		
		String str = stringReverse("core2web");	
		System.out.println(str);
	}
}
