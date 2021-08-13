
public class ProductPrinter {
	
	public static void main(String[] args) {
		
		int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
		int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
		
		int result = 0;
		//iterate over the first set of numbers
		for (int i = 0; i < arr1.length; i++) {
			//iterate over t he second set of numbers
			for (int j = 0; j < arr2.length; j++) {
				//print the product of the current elements from each set
				 result += arr1[i]*arr2[j];	
			}
		}
				 
	
		//iterate over the first set of numbers
		for (int k = 0; k < arr1.length; k++) {
			//iterate over t he second set of numbers
			for (int m = 0; m < arr2.length; m++) {
			//print the product of the current elements from each set
				System.out.println(arr1[k]*arr2[m]);
			}
		}
		System.out.println("result = " + result);
	}

}
