class InsertionSort{
	public static void main(String[] args){
		int[] arr = new int[]{9,4,7,2,6,1,3,0};
		for(int i=1;i<arr.length;i++){
			int element = arr[i];
			int j = i-1; //last index of sorted sub-array
			while(j>=0 && arr[j]>element){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}System.out.println();
	}
}
