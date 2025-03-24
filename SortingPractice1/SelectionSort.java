class SelectionSort{
	public static void main(String[] args){
		int[] arr = new int[]{8,2,5,3,1,9,4};
		for(int i=0;i<arr.length;i++){
			int minIndex = i;
			for(int j=i;j<arr.length;j++){
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
