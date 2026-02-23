package logical;

public class FindCommonElementFromArrays {
	public static void main(String[] args) {
		int arr1[]= {10,30,40,80,90};
		int arr2[]= {20,30,60,70,50,80};
		 
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					// 10==20, 10==30, 10==60, 10==70, 10==50, 10==80
					//30==20, 30==30.
					// 40==20, 40==30, 40==60, 40==70, 40==50, 40==80
					// 80==20, 80==30, 80==60, 80==70, 80==50, 80==80
					// 90==20, 90==30, 90==60, 90==70, 90==50, 90==80
					
 
					System.out.println(arr1[i]);
				}
			}
		}
			 
	}
}
