class Demo{
	public static void main(String[] args){
		int[] arr = new int[]{7,4,2,5,9,3,8,6};
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}System.out.println();
		int start = 0;
		int end = arr.length-1;
		int pivot = arr[end];
		int i = start-1;
		for(int j=start;j<end;j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+" ");
			}System.out.println();
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}System.out.println();
	}
}
