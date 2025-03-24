//Brute Force Approach

class EqIndex{
	public static void main(String[] args){
		//int[] arr = new int[]{-7,1,5,2,-4,3,0};
		int[] arr = new int[]{1,2,3};
		System.out.println(eqInd(arr));

	}
	static int eqInd(int[] arr){
		int n = arr.length;
		int eqIndex = -1;
		for(int i=0;i<n;i++){
			int leftSum = 0;
			int rightSum = 0;
			for(int j=0;j<n;j++){
				if(j<i){
					leftSum = leftSum+arr[j];
				}
				else if(j>i){
					rightSum = rightSum+arr[j];
				}
			}
			if(leftSum==rightSum){
				eqIndex = i;
				break;
			}
		}
		return eqIndex;

	}

}
