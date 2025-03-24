class Demo{
	static void selectionSort(int[] arr,int i,int j,int minIndex){
		if(i>=arr.length){
			return;
		}
		if(j<arr.length){
			if(arr[minIndex]>arr[j]){
				minIndex = j;
			}
		}
		else{
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			i++;
			minIndex = i;
			j = i+1;
		}
		selectionSort(arr,i,j+1,minIndex);
	}
	public static void main(String[] args){
		int arr[] = new int[]{9,8,7,6,5,4,3,2,1};
		int i = 0;
		int minIndex = i;
		int j = i+1;
		selectionSort(arr,i,j,minIndex);
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}System.out.println();
	}
}
