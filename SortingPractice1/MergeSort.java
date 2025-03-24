class Demo{
	//divides the array into 2
	void mergeSort(int[] arr,int start,int end){
		if(start<end){
			int mid = start+(end-start)/2;
			mergeSort(arr,start,mid);	//arr1
			mergeSort(arr,mid+1,end);	//arr2
			merge(arr,start,mid,end);
		}
	}
	private void merge(int[] arr,int start,int mid,int end){
		int n1 = mid-start+1;
		int n2 = end-mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for(int i=0;i<n1;i++){
			arr1[i] = arr[start+i];
		}
		for(int i=0;i<n2;i++){
			arr2[i] = arr[mid+1+i];
		}
		int i=0,j=0,k=start;
		while(i<n1 && j<n2){
			if(arr1[i]<arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k] = arr2[j];			
			j++;
			k++;
		}
	}
}
class MergeSort{
	public static void main(String[] args){
		Demo obj = new Demo();
		//int[] arr = new int[]{4,8,2,1,9,3,7};
		int[] arr = new int[]{44,234,112,243,9723,240123,92};
		obj.mergeSort(arr,0,6);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
		
	}
}
