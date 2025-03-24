class BubbleSort{
	static int count = 0;	
	static void bubbleSort(int[] arr,int start,int end,boolean swapped){
		if(start==end){
			start = 0;
			end--;
			if(start==end || swapped==false){
				System.out.println("recursion count : "+count);
				return;
			}
			swapped = false;
		}
		count++;
		if(arr[start]>arr[start+1]){
			int temp = arr[start];
			arr[start] = arr[start+1];
			arr[start+1] = temp;
			swapped = true;
		}
	
		bubbleSort(arr,start+1,end,swapped);
	}
	public static void main(String[] args){
		//int[] arr = new int[]{7,3,9,4,2,5,6};
		int[] arr = new int []{2,3,4,5,6,9,7};
		bubbleSort(arr,0,arr.length-1,false);
		for(int i=0;i<arr.length;i++){
			System.out.print("[ "+arr[i]+" ]");
		}System.out.println();
	}
}
