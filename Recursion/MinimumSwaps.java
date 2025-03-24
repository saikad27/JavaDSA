class MinimumSwaps{
	public static void main(String[] args){
		int[] arr = new int[]{1,12,10,14,3,10,5};
		int b = 8;
		int subArrSize = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=8){
				subArrSize++;
			}
		}
		int subSatisfiedMaxCount = 0;
		int end = subArrSize-1;
		for(int i=0;end<arr.length;i++){
			int subSatisfiedCount = 0;
			for(int j=i;j<=end;j++){
				if(arr[j]<=8){
					subSatisfiedCount++;	
				}
			}
			if(subSatisfiedCount>subSatisfiedMaxCount){
				subSatisfiedMaxCount = subSatisfiedCount;
			}
			end++;
		}
		int swaps = subArrSize-subSatisfiedMaxCount;
		System.out.println("Total no. of swaps : "+swaps);
	}
}
