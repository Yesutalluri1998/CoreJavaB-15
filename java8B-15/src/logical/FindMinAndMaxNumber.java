package logical;

public class FindMinAndMaxNumber {
	public static void main(String[] args) {
		int arr[]= {12,9,27,34,25,7,15,55,5,3};
		int min=arr[0]; //12,9,7,5,3
		int max=arr[0]; //12,27,34,55
		
		for(int i=0;i<arr.length;i++) {
			
			if(min>arr[i]) {
// 12>9=true; 9>27=false; 9>34=false; 9>25=false; 9>7=true; 7>15=false; 7>55=false; 7>5=true; 5>3=true	 
				
				min=arr[i];
				
				
			}else {
				if(max<arr[i]) {
// 12<9=false; 12<27=true; 27<34=true; 34<25=false; 34<7=false; 34<15=false; 34<55=true; 55<5=false; 55<3=false.
					
					max=arr[i];
				}
			}
			
		}
		System.out.println(min);
		System.out.println(max);
	}
}
