class Demo{
	public static void main(String[] args){
		int[] arr = new int[]{22,85,2,6,91,33,99,55};
		for(int i=1;i<arr.length;i++){
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
