class Demo{
	public static void main(String[] args){
		int[] arr = new int[]{5,4,3,2,1};
		int count = 0;
		for(int i=0;i<arr.length;i++){
			boolean isSorted = true;
			for(int j=0;j<arr.length-1-i;j++){
				count++;
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
			}
			if(isSorted)
				break;
		}
		System.out.println(count);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
