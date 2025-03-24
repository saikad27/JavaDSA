class Demo{
	public static void main(String[] args){
		int[] arr = new int[]{5,2,3,1,6,7};
		int count = 0;
		for(int i=1;i<arr.length;i++){
			int element = arr[i];
			int j = i-1;
			for(;j>=0 && arr[j]>element;){
					count++;
					arr[j+1] = arr[j];
					j--;
			}
			arr[j+1] = element;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(count);
	}
}
