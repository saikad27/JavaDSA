class Merge2Arrays{
	public static void main(String[] args){
		int[] arr1 = new int[]{3,7,9,11};
		int[] arr2 = new int[]{2,5,8};
		int[] arr3 = new int[arr1.length+arr2.length];
		merge(arr1,arr2,arr3);
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}System.out.println();
	}
	static int i = 0;
	static int j = 0;
	static int k = 0;
	static void merge(int[] arr1,int[] arr2,int[] arr3){
		if(k==arr3.length){
			return;
		}
		if(j==arr2.length || arr1[i]<arr2[j]){
			arr3[k] = arr1[i];
			i++;
		}else if(i==arr1.length || arr2[j]<=arr1[i]){
			arr3[k] = arr2[j];
			j++;
		}
		k++;
		merge(arr1,arr2,arr3);
	}	
}
