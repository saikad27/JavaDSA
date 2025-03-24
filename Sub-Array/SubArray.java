//Brute Force Approach

class SubArray{
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,1,3,6,6,4,6,3};
		System.out.println(subArr(arr));

	}
	static int subArr(int[] arr){
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int size = n;
		//Gives minimum and maximum element
		for(int i=0;i<n;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
			}	
		}
		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
		int previousSize = size;
		int leftSubSize = 0;
		int rightSubSize = 0;
		for(int i=0;i<n;i++){
			if(min==arr[i]){
			//previousSize = size;
				for(int j=0;j<n;j++){
					if(arr[j]==max){
						
						if(i>j){
							size = i-j+1;
						}else{
							size = j-i+1;
						}
						if(previousSize<size){
							size = previousSize;
						}else{
							previousSize = size;
						}
					}
				}
				//if(previousSize<size)
			}
		}
		//System.out.println("Min Index : "+minInd);
		//System.out.println("Max Index : "+maxInd);
		return size;

	}

}
