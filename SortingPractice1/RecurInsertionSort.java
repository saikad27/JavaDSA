class Demo{
	static void insertionSort(int[] arr,int i,int j){
		if(i==arr.length){
			return;
		}
		int element = arr[i];
		while(j>=0 && arr[j]>element){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = element;
		insertionSort(arr,i+1,i);
		
	}
	public static void main(String[] args){
		int[] arr = new int[]{9,1,6,2,5,4};
		insertionSort(arr,1,0);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
