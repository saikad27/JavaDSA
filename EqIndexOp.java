//Optimized Approach

class EqIndexOp{
	public static void main(String[] args){
		int[] arr = new int[]{1,-1,4};
		System.out.println(eqInd(arr));

	}
	static int eqInd(int[] arr){
		int n = arr.length;
		int eqIndex = -1;
		int[] leftSum = new int[n];
		int[] rightSum = new int[n];
		leftSum[0] = arr[0];
		rightSum[n-1] = arr[n-1];
		for(int i=1; i<n; i++){
			leftSum[i] = leftSum[i-1]+arr[i];			
		}
		for(int i=n-2; i>=0; i--){
			rightSum[i] = rightSum[i+1]+arr[i];
		}
		for(int i=0;i<n;i++){
			if(leftSum[i]==rightSum[i]){
				eqIndex = i;
				break;
			}
		}
		return eqIndex;

	}

}
