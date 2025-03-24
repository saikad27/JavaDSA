class Demo{
	static void selectionSort(int[] arr,int i){
		if(i>=arr.length){
			return;
		}
		int minIndex = i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[minIndex]>arr[j]){
				minIndex = j;
			}
		}
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
		selectionSort(arr,i+1);
	}
	public static void main(String[] args){
		int arr[] = new int[]{9,8,7,6,5,4,3,2,1};
		selectionSort(arr,0);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
