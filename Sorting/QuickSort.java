class QuickSort{
	static void quickSort(int[] arr,int start,int end){
		if(start<end){
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	static int partition(int[] arr,int start,int end){
		int pivot = arr[end];
		int i = start-1;
		for(int j=start;j<end;j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[end];
		arr[end] = arr[i+1];
		arr[i+1] = temp;
		return i+1;
	}
	public static void main(String[] args){
		int[] arr = new int[]{9,18,7,26,5,34,3,42,1};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
