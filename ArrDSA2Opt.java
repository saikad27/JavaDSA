class Main{
	public static void main(String[] args){
		int[] arr = new int[]{2,5,1,4,8,0,8,1,3,8};
		int n = 10;
		int temp = arr[0];
		int count = 0;
		int result;
		for(int i=0;i<n;i++){
			if(arr[i]>temp){
				temp = arr[i];
			}
		}
		for(int i=0;i<n;i++){
			if(temp==arr[i]){
				count++;
			}
		}
		result = n-count;
		System.out.println("Total no.s with atleast 1 greater : "+result);
	}
}
