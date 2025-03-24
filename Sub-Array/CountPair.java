class CountPair{
	public static void main(String[] args){
		char[] arr = new char[]{'a','b','e','g','a','g'};
		int count = countPair(arr);
		System.out.println(count);
	}
	static int countPair(char[] arr){
		int count = 0;
		int itr = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!='a'){
				continue;
			}
			for(int j=i+1;j<arr.length;j++){
				itr++;
				if(arr[j]=='g')
					count++;
			}
		}
		System.out.println("Iteration : "+itr);
		return count;
	}

}
