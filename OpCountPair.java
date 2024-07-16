class OpCountPair{
	public static void main(String[] args){
		char[] arr = new char[]{'a','b','e','g','a','g'};
		int aCount = 0;
		int gCount = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a')
				aCount++;
			if(arr[i]=='g')
				gCount = gCount+aCount;		//gCount = gCount+aCount*1
		}
		System.out.println(gCount);
	}

}
